package com.example.consultadd.tixdo_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.consultadd.tixdo_login.Model.User;
import com.example.consultadd.tixdo_login.utilities.VolleyHandler;
import com.example.consultadd.tixdo_login.utilities.VolleyListener;

public class MainActivity extends AppCompatActivity implements VolleyListener {

    private Button mlogin;
    private EditText musername;
    private EditText mpassword;
    private TextView mname;
    private TextView memail;
    private TextView mid;
    private Button mlogout;
    private TextView p;
    //User user=new User();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlogin = (Button) findViewById(R.id.btn_login);
        musername = (EditText) findViewById(R.id.edt_txt_username);
        mpassword = (EditText) findViewById(R.id.edt_txt_password);
        mname = (TextView) findViewById(R.id.txt_name);
        mid = (TextView) findViewById(R.id.txt_id);
        memail = (TextView) findViewById(R.id.txt_email);
        mlogout = (Button) findViewById(R.id.btn_logout);
        //p=(TextView)findViewById(R.id.txt_password);


        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VolleyHandler volleyhandler=new VolleyHandler(MainActivity.this);
                volleyhandler.login(musername.getText().toString(),mpassword.getText().toString());

            }

        });


    }

    @Override
    public void response(int code, Object response) {
        switch (code) {
            case VolleyHandler.GET_USER:
                User user = (User) response;
                Intent intent=new Intent(MainActivity.this,UserprofileActivity.class);
                intent.putExtra("user",user);
                startActivity(intent);
                break;
        }
    }
}
