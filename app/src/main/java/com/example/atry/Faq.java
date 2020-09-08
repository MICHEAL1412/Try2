package com.example.atry;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Faq extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.faq);
            Intent intent = getIntent();
    }

    public void Rating(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Rating.class);
        startActivity(intent);

    }
    public void general(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, General.class);
        startActivity(intent);

    }
    public void FB(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Food.class);
        startActivity(intent);

    }
    public void feedback(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Feedback.class);
        startActivity(intent);

    }
}
