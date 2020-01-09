package com.example.lifecycleactivity26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","OnCreate");

        mBtnNavigate = findViewById(R.id.buttonNavigate);

        mBtnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onDestroy");
    }
}
