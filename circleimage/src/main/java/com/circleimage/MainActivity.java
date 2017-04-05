package com.circleimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circlelayout);
         CircleImage head ;
        head =(CircleImage)findViewById(R.id.image);
        head.setImageResource(R.mipmap.ic_launcher);
    }

}
