package com.src.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.src.calset.DigiCutter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText anyNumber = findViewById(R.id.number);
        Button button =findViewById(R.id.button);


        final DigiCutter digiCutter=new DigiCutter();// Call Libs + Positive
        digiCutter.NumberSeparator(anyNumber); // It's Separate EditText by comma (0,000) in typing mode

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double backINTNumber=digiCutter.backIntNumber(anyNumber);// Convert String to number

                backINTNumber=backINTNumber*0.0475;

                TextView textView= findViewById(R.id.textView);
                TextView textView1= findViewById(R.id.textView1);
                // Take double value and convert to text by control rate (.00000)
                textView.setText(digiCutter.showNumberDouble(backINTNumber,".0"));
                // Take double value but convert to Integer then text
                textView1.setText(digiCutter.showNumber(backINTNumber));
            }
        });


    }
}
