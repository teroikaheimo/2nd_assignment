package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView imgStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        imgStar = findViewById(R.id.imgStar);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleStarImg();
            }
        });
    }

    private void toggleStarImg() {
        if (imgStar.getVisibility() == View.VISIBLE) {
            imgStar.setVisibility(View.INVISIBLE);
        } else {
            imgStar.setVisibility(View.VISIBLE);
        }
    }

}
