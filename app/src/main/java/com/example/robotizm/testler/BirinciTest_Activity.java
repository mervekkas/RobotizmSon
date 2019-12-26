package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class BirinciTest_Activity extends AppCompatActivity {

    TextView soru11Text;
    TextView yanlis11Text;
    TextView dogru11Text;
    TextView soru12Text;
    TextView yanlis12Text;
    TextView dogru12Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birinci_test_);

        soru11Text = findViewById(R.id.soru11Text);
        soru11Text.setText("1-) Kuşun domuza ulaşması için hangi yolu izlemesi gerekir?");

        yanlis11Text = findViewById(R.id.yanlis11Text);
        dogru11Text = findViewById(R.id.dogru11Text);

        soru12Text = findViewById(R.id.soru12Text);
        soru12Text.setText("3-)\n  Üçgen ile başlayın\n  Üçgenin altına kare yerleştirin\n  Karenin altına başka bir üçgen yerleştirin\n" +
                "  Yukarıdaki komutların görüntüsü aşağıdakilerden hangisi değildir?");

        yanlis12Text = findViewById(R.id.yanlis12Text);
        dogru12Text = findViewById(R.id.dogru12Text);
    }
    public void soru11yanlis(View view){

        dogru11Text.setText("");
        yanlis11Text.setText("Yanlış Cevap :(");
    }
    public void soru11dogru(View view){

        yanlis11Text.setText("");
        dogru11Text.setText(" Doğru Cevap!\n   Tebrikler :)");
    }
    public void soru12yanlis(View view) {

        dogru12Text.setText("");
        yanlis12Text.setText("Yanlış Cevap :(");
    }
    public void soru12dogru(View view){

        yanlis12Text.setText("");
        dogru12Text.setText(" Doğru Cevap!\n   Tebrikler :)");
    }

}
