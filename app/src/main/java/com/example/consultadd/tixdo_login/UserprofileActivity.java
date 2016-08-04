package com.example.consultadd.tixdo_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.consultadd.tixdo_login.Model.User;

/**
 * Created by consultadd on 3/8/16.
 */
public class UserprofileActivity extends AppCompatActivity {

    private TextView mname;
    private TextView memail;
    private TextView mid;
    private Button mlogout;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        User user = (User) getIntent().getSerializableExtra("user");
        mname = (TextView) findViewById(R.id.txt_name);
        mid = (TextView) findViewById(R.id.txt_id);
        memail = (TextView) findViewById(R.id.txt_email);
        mlogout = (Button) findViewById(R.id.btn_logout);
        mname.setText(user.getUsername());
        memail.setText(user.getEmail());
        mid.setText(user.getId());

        mlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserprofileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


}

