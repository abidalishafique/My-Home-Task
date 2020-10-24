package org.haqnawaz.a20201021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        String PreviousActivityText = getIntent().getStringExtra("Result");
        TextView textView = findViewById(R.id.textView2);
        textView.setText(PreviousActivityText+textView.getText());
    }
}