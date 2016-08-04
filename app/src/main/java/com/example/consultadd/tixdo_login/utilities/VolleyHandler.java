package com.example.consultadd.tixdo_login.utilities;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.consultadd.tixdo_login.Model.User;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by consultadd on 3/8/16.
 */
public class VolleyHandler {



    public static final String BASEURL="http://54.169.241.123/api/rest-auth/";
    public static final String URLLOGIN=BASEURL+"v2/login/";
    public static final String URLDATA=BASEURL+"user/";
    public static final int GET_USER = 1;
    private static boolean flag=false;
    Context mContext;
    User user=new User();
    VolleyListener mListner;
    JSONObject jsonobject = null;



    public VolleyHandler(Activity context) {
        mContext = context;
        mListner = (VolleyListener) context;

    }

    public User login(final String name, final String password) {

        JSONObject obj = new JSONObject();
        try {
            obj.put("input_value",name);
            obj.put("password",password);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.POST, URLLOGIN,obj, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        String key= null;
                        try {
                            key = response.getString("key");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        GetUser(key);
                        //mTxtDisplay.setText("Response: " + response.toString());
                        //Toast.makeText(mContext,key,Toast.LENGTH_SHORT).show();

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(mContext,"Invalid Username/Password",Toast.LENGTH_SHORT).show();
                        // TODO Auto-generated method stub

                    }
                }
        );
        RequestQueue requestQueue = Volley.newRequestQueue(mContext);
        requestQueue.add(jsObjRequest);
        return user;
    }




    //function to fetch profile

        public void GetUser(final String key) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URLDATA,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            jsonobject = new JSONObject(response.toString());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        Gson gson=new Gson();
                        user=gson.fromJson(jsonobject.toString(),User.class);
                        //Toast.makeText(mContext,user.getReferral_code(), Toast.LENGTH_LONG).show();
                        //Log.d("referral_code" ,user.getReferral_code());
                        //flag=true;
                        mListner.response(GET_USER,user);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(mContext, "@@@@@@@@@@@@", Toast.LENGTH_SHORT).show();

                    }
                }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                //Adding parameters to request
                headers.put("Authorization", "Token "+key);
                headers.put("Content-Type", "application/json");
                return headers;
            }

        };

        //Adding the string request to the queue
        RequestQueue requestQueue = Volley.newRequestQueue(mContext);
        requestQueue.add(stringRequest);

    }

    public boolean getFlag(){return flag;}


}
