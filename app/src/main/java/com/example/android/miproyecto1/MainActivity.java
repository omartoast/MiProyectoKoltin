package com.example.android.miproyecto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setUp(View view){
        Toast.makeText(getApplicationContext(),"your toast text",Toast.LENGTH_LONG).show();
    }
}
