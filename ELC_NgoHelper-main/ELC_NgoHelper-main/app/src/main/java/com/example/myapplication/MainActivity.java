package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Volunteer(View view)
    {
        Intent intent= new Intent(this,USERPAGE.class);
        startActivity(intent);
    }
     public void NGO(View view)
     {
         Intent intent= new Intent(this,NgoLogin.class);
         startActivity(intent);
     }


}