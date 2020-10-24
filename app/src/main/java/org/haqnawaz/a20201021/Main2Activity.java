package org.haqnawaz.a20201021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup1;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioButton1;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup1 = findViewById(R.id.radioGroup1);
        //textView = findViewById(R.id.textViewResults);
    }

    public void ShowSelection(View view) {

        int checked = radioGroup.getCheckedRadioButtonId();
        int checked1 = radioGroup1.getCheckedRadioButtonId();
        radioButton = findViewById(checked);
        radioButton1 = findViewById(checked1);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        String Result=radioButton.getText()+" and "+ radioButton1.getText();

        if(checkBox1.isChecked())
        {
            Result+=" and "+checkBox1.getText();
        }
        if(checkBox2.isChecked())
        {
            Result+=" and "+checkBox2.getText();
        }
        if(checkBox3.isChecked())
        {
            Result+=" and "+checkBox3.getText();
        }
        if(checkBox4.isChecked())
        {
            Result+=" and "+checkBox4.getText();
        }
        Intent secondActivity = new Intent(this,MainActivity2.class);
        secondActivity.putExtra("Result",Result);
        startActivity(secondActivity);
        //textView.setText(radioButton.getText()+" and "+ radioButton1.getText());

    }
}
