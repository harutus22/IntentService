package com.example.intentservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.edit_text_input);
    }

    public void startService(View view){
        String text = input.getText().toString();
        Intent intent = new Intent(this, ExampleIntentService.class);
        intent.putExtra("inputExtra", text);
        ContextCompat.startForegroundService(this, intent);
    }
}
