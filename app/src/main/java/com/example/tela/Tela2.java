package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent = getIntent();

        String resultWeigth = intent.getStringExtra("weigth");
        String resultHeigth = intent.getStringExtra("height");

        Float result = Float.parseFloat(resultWeigth) / (Float.parseFloat(resultHeigth) * Float.parseFloat(resultHeigth));

        TextView destino = (TextView) findViewById(R.id.destino);
        destino.setText(result.toString());

        //image
        if(result > 0 && result < 18.5){
            ImageView i = (ImageView) findViewById(R.id.image);
            i.setImageResource(R.drawable.baixo);
        } else if(result > 18.6 && result < 24.9){
            ImageView i = (ImageView) findViewById(R.id.image);
            i.setImageResource(R.drawable.normal);
        } else if(result > 25.0 && result < 29.9){
            ImageView i = (ImageView) findViewById(R.id.image);
            i.setImageResource(R.drawable.obeso1);
        } else if(result > 30.0 && result < 34.9){
            ImageView i = (ImageView) findViewById(R.id.image);
            i.setImageResource(R.drawable.obeso2);
        }


        //button
        Button button = (Button)findViewById(R.id.back);
        button.setOnClickListener( v -> {
            Intent intent1 = new Intent(this, MainActivity.class);

            startActivity(intent1);

            finish();
        });

    }
}