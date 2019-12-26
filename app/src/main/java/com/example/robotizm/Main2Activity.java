package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void girisButton(View view){
        Intent intent=new Intent(Main2Activity.this, AnaSayfaActivity.class);
        startActivity(intent);

    }
    public void üyeOlButton(View view) {
        Intent intent = new Intent(Main2Activity.this, uyeOlButtonActivity.class);
        startActivity(intent);
    }

    public void sifreUnuttumButton(View view){
        Intent intent=new Intent(Main2Activity.this,sifreUnuttumActivity.class);
        startActivity(intent);
    }
}
