package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button signIn;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        signIn = (Button) findViewById(R.id.signIn);
    }
    public void loginValidate(View view){
        Bundle b = getIntent().getExtras();
        String pass;
        String uid;

        if(b != null){
            pass = b.getString("pwd");
            uid = b.getString("uid");
            if( username.getText().toString().equals(uid) && password.getText().toString().equals(pass)){
                Intent i = new Intent(this,home.class);
                startActivity(i);
                Toast.makeText(this, "Sign up successful",Toast.LENGTH_LONG).show();
            }
            else{
                if(count < 3){
                    Toast.makeText(this,"login failed",Toast.LENGTH_LONG).show();
                    count++;
                   }
                else{
                    signIn.setEnabled(false);
                    Toast.makeText(this,"login locked",Toast.LENGTH_LONG).show();
                }
            }

        }

    }
}