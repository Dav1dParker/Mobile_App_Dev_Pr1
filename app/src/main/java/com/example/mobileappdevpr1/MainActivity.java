package com.example.mobileappdevpr1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Context context = getApplicationContext();
        CharSequence text = "This is onCreate toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    @Override
    protected void onStart() {
        super.onStart();

        Context context = getApplicationContext();
        CharSequence text = "This is onStart toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();

        Context context = getApplicationContext();
        CharSequence text = "This is onStop toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Context context = getApplicationContext();
        CharSequence text = "This is onDestroy toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();

        Context context = getApplicationContext();
        CharSequence text = "This is onPause toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();

        Context context = getApplicationContext();
        CharSequence text = "This is onResume toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}