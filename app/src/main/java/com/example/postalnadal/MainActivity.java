package com.example.postalnadal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] imgList = {R.drawable.download1,R.drawable.download2,R.drawable.postal_amor};
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.postal);
        textView = findViewById(R.id.nombre);
        Bundle b = getIntent().getExtras();
        textView.setText(b.getString("nombre"));



        Random rnd = new Random();
        int pickedimg = rnd.nextInt(imgList.length);
        imageView.setImageResource(imgList[pickedimg]);
    }
}