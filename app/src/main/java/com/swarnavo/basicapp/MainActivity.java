package com.swarnavo.basicapp;

import android.media.Image;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Initializes the components
         Button btnCh = findViewById(R.id.btnChange);
         TextView txtVw = findViewById(R.id.txtShow);
         Button btnReset = findViewById(R.id.btnReset);
        ImageView imgPop = findViewById(R.id.imgPopup);

         //Initializing the state
        final int[] count = {0};

        //Button to increase counter
         btnCh.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 count[0]++;
                 txtVw.setText(""+count[0]);

                 Toast.makeText(getApplicationContext(), "Counter is increased to "+ count[0], Toast.LENGTH_SHORT).show();

             }
         });


         //Button to reset the counter
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0] = 0;
                txtVw.setText(""+count[0]);

                Toast.makeText(getApplicationContext(), "Counter is reset", Toast.LENGTH_SHORT).show();
            }
        });

        //Logo clickable shows toast
        imgPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Counter App By Swarnavo", Toast.LENGTH_LONG).show();
            }
        });





//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}