package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener( v -> {
            EditText height = (EditText) findViewById(R.id.heigth);
            String resultHeight = height.getText().toString();

            EditText weigth = (EditText) findViewById(R.id.weigth);
            String resultWeigth = weigth.getText().toString();

            Intent intent = new Intent(this, Tela2.class);

            intent.putExtra("height", resultHeight);
            intent.putExtra("weigth", resultWeigth);

            startActivity(intent);

            finish();
        });
    }
}