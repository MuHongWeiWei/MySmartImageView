package com.example.tester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MySmatImageView imageView = findViewById(R.id.iv);
        imageView.setImageUrl("https://www.baidu.com/img/bd_logo1.png");
    }
}
