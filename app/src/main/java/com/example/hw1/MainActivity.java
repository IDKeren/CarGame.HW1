package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        startMenu();
    }

    private void startMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
        finish();

    }

}