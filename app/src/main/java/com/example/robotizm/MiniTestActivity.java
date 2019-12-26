package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.robotizm.testler.BirinciTest_Activity;
import com.example.robotizm.testler.IkinciTest_Activity;

import java.util.ArrayList;

public class MiniTestActivity extends AppCompatActivity {

    ListView testlist;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_test);


        testlist = findViewById(R.id.testlist);

        ArrayList<String> testler = new ArrayList<>();
        testler.add("test1");
        testler.add("Bilişim Teknolojilerinin Günlük Yaşamdaki Önemi");

        arrayAdapter = new ArrayAdapter(this,R.layout.mytextview,testler);

        testlist.setAdapter(arrayAdapter);

        testlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(MiniTestActivity.this, BirinciTest_Activity.class);
                    startActivity(intent);
                }
                if(position == 1){

                    Intent intent = new Intent(MiniTestActivity.this, IkinciTest_Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
