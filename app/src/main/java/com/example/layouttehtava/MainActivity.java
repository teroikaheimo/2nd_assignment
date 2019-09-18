package com.example.layouttehtava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

/*
* Create a new Android program called "LayoutTehtava"

The main screen divides into four rectangle-shaped sections each of equal area. Make the background of all four (4) sections slightly different colour so the division between sections can be seen.

Section 1 consists of a button (button1) in the middle of the section (no hardcoded positioning or constraintlayout).

Section 2 consists of a picture (picture1) (any picture smaller than the section will do) in the lower-right corner of the section (again no hardcoded positioning or constraintlayout).

Section 3 divides into two sub-sections horizontally (so that the sub-sections are on top of each other) taking equal area of their parent section, both sections are of different colour from other sections and each other.

Section 4 has two buttons (button2 and button3) which fill the whole section so that other takes 40% of the section and other 60% of the section.

Button1 enables/disables button2 and button3. Button2 hides picture1 and button3 shows picture1 again if it's hidden. Button3 only accepts long pushes of the button. Normal quick click does not do anything.

All four main sections need to retain the same area on the screen even if the device orientation changes. This means that the dimensions of the layouts may not be hardcoded.
* */
public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3;
    private ImageView imgStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI elements
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        imgStar = findViewById(R.id.imgStar);

        // Set button click handlers
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableBtnTwoAndThree();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHideStar(false);
            }
        });

        button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showHideStar(true);
                return true;
            }
        });
    }

    private void disableBtnTwoAndThree() {
        if (button2.isEnabled()) {
            button2.setEnabled(false);
            button3.setEnabled(false);
        } else {
            button2.setEnabled(true);
            button3.setEnabled(true);
        }
    }

    private void showHideStar(boolean value) {
        if (value) {
            imgStar.setVisibility(View.VISIBLE);
        } else {
            imgStar.setVisibility(View.INVISIBLE);
        }
    }
}
