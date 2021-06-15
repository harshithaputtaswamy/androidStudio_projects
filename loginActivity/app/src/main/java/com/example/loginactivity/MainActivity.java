package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button signUp;
    private static Pattern PatMatch =
            Pattern.compile("^" +
                    "(?=.*[@#$%^&+=])"+
                    "(?=.*[A-Z])"+
                    "(?=.*[a-z])"+
                    "(?=.*[0-9])"+
                    "(?=\\S+$)"+
                    "(.{8,})"+
                    "$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        signUp = (Button) findViewById(R.id.signUp);
    }

    public void validatePassword(View view){
        String passInput = password.getText().toString().trim();
        Bundle b = new Bundle();
        b.putString("uid",username.getText().toString());
        b.putString("pwd",password.getText().toString());

        if(passInput.length() == 0){
            password.setError("Length cannot be zero");
        }
        else if(!PatMatch.matcher(passInput).matches()){
            password.setError("condition not matched");
        }
        else if(passInput.length() < 8){
            password.setError("Length is less than 8");
        }
        else{
            password.setError(null);
            Toast.makeText(this, "Sign up successful",Toast.LENGTH_LONG).show();
            Intent i =  new Intent(this,login.class);
            i.putExtras(b);
            startActivity(i);
        }
    }
}