package com.example.postalnadal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        name = findViewById(R.id.username);
    }
    public void postal(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("nombre",name.getText().toString());
        startActivity(intent);
    }
}