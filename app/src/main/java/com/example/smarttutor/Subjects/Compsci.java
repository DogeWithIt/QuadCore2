package com.example.smarttutor.Subjects;


import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smarttutor.Home;
import com.example.smarttutor.R;

public class Compsci extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compsci);

        ImageView imageView = (ImageView)findViewById(R.id.imageView4);
        imageView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event){
                Intent intent = new Intent(Compsci.this, Home.class);
                Compsci.this.startActivity(intent);
                return false;
            }
        });
    }
}