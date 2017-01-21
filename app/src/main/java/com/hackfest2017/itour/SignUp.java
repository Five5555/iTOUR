package com.hackfest2017.itour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class SignUp extends AppCompatActivity {
    LinearLayout namelayout;
    LinearLayout usernamelayout;
    LinearLayout passwordlayout;
    LinearLayout genderlayout;
    EditText nametext;
    EditText usernametext;
    EditText password;
    RadioButton rdomale;
    RadioButton rdofemale;
    Button Signup_submit;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        namelayout = (LinearLayout) findViewById(R.id.namelayout);
        usernamelayout = (LinearLayout) findViewById(R.id.usernamelayout);
        passwordlayout = (LinearLayout) findViewById(R.id.passwordlayout);
        genderlayout = (LinearLayout) findViewById(R.id.genderlayout);
        nametext = (EditText) findViewById(R.id.nametext);
        usernametext = (EditText) findViewById(R.id.usernametext);
        password = (EditText) findViewById(R.id.password);
        // rdomale = (RadioButton) findViewById(R.id.radiomale);
        //rdofemale = (RadioButton) findViewById(R.id.radiofemale);
        Signup_submit = (Button) findViewById(R.id.Signup_submit);
        rg = (RadioGroup) findViewById(R.id.RG);


       /* if(rdomale.isChecked()){
            rdofemale.isChecked()=false;
        }
        else {
            rdomale.isChecked() = false;
        }*/
        Signup_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, Home.class);
                startActivity(intent);
            }

                                         }
        );
    }

    public void onSignUpButtonClick(){
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        String name = (String) rb.getText();
    }



}


