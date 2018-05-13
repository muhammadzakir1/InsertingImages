package com.example.zakiryousuf.insertingimages;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int imageStatus=0;
    public void insertImage(View view)
    {
        ImageView img=(ImageView)findViewById(R.id.imageView);
        if(imageStatus==0)
        {
            img.setImageResource(R.drawable.iu);
            imageStatus=1;
        }
        else {
            img.setImageResource(R.drawable.logo);
            imageStatus = 0;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
