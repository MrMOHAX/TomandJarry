package com.example.tomandjary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isTomVisble = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {
        if (isTomVisble) {
            ImageView tomImageView2 = findViewById(R.id.tomimageView2);
            tomImageView2.animate().rotation(3600).setDuration(3000);
            tomImageView2.animate().alpha(0).setDuration(3000);
            ImageView jerryimageView = findViewById(R.id.jerryimageView);
            jerryimageView.animate().rotation(3600).setDuration(3000);
            jerryimageView.animate().alpha(1).setDuration(3000);
            isTomVisble = false;
        } else {
            ImageView tomImageView2 = findViewById(R.id.tomimageView2);
            tomImageView2.animate().rotation(0).setDuration(3000);
            tomImageView2.animate().alpha(1).setDuration(3000);
            ImageView jerryimageView = findViewById(R.id.jerryimageView);
            jerryimageView.animate().rotation(0).setDuration(3000);
            jerryimageView.animate().alpha(0).setDuration(3000);
            isTomVisble = true;
        }


    }
}