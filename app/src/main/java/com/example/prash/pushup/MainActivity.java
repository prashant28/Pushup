package com.example.prash.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uploadOnGitHub() {
        System.out.println("Project uploaded");
        int i = 2;
        int j = 4;
    }
}
