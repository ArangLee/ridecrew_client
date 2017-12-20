package com.ridecrew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.ridecrew.ridecrew.R;


public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        EditText ckpasswordText = (EditText) findViewById(R.id.ckpasswordText);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText emailText = (EditText) findViewById(R.id.emailText);

        Button registerButton =(Button) findViewById(R.id.registerButton);
        Button cancleButton =(Button) findViewById(R.id.cancleButton);



    }

}
