package com.github.nikhilbhutani.buildinglib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.nikhilbhutani.myfirstlibrary.AwesomeLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AwesomeLibrary.getInstance().makeMeAwesome(this,"Nikhil");

    }
}
