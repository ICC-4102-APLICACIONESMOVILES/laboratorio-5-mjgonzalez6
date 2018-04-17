package com.example.mariajose.project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;



public class MainActivity extends AppCompatActivity {

    public static final String MY_REFERENCES = "my_references";

    private EditText userMail;
    private EditText userPassword;
    private TextView Info;
    private Button buttonLogin;


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userMail = (EditText)findViewById(R.id.etName);
        userPassword = (EditText)findViewById(R.id.etPassword);
        buttonLogin = (Button)findViewById(R.id.btnLogin);



        sharedPreferences = getSharedPreferences(MY_REFERENCES, Context.MODE_PRIVATE);



        buttonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                valLogin(userMail.getText().toString(), userPassword.getText().toString());
                editor = sharedPreferences.edit();
                editor.putString(String.valueOf(userMail), String.valueOf(userPassword));
                editor.commit();

            }
        });

    }

    private void valLogin(String userName, String userPassword) {

        Toast notification = Toast.makeText(getApplicationContext(), "Correct mail format", Toast.LENGTH_SHORT);
        Toast failLogin = Toast.makeText(getApplicationContext(), "Invalid username", Toast.LENGTH_SHORT);


        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
        notification.show();

        failLogin.show();

        }
    }

