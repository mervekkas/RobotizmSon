package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnaSayfaActivity extends AppCompatActivity {

    Button oyunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        oyunButton = findViewById(R.id.oyunButton);
    }
    public void robotbeymer(View view){

        Toast.makeText(getApplicationContext(),"Sevgili Dostum, Sana Yardım Edebilmem İçin Lütfen Soru İşaretine Tıkla", 4000).show();
    }
    public void soruisareti(View view){

        Intent intent = new Intent(AnaSayfaActivity.this,SoruIsaretiActivity.class);
        startActivity(intent);
    }
    public void minitestler(View view){

        Intent intent = new Intent(AnaSayfaActivity.this,MiniTestActivity.class);
        startActivity(intent);
    }

}
