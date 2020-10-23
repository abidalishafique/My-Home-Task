package org.haqnawaz.a20201021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowToast(View view) {
        Context context = this;
        String string = "Written on the toast";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,string,duration);
        toast.setGravity(Gravity.RIGHT,200,200);
        toast.show();
    }

    public void CustomToastShow (View view)
    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.toast_container));

        TextView text = layout.findViewById(R.id.textViewToast);
        text.setText("This is my custom toast");

        Toast toast =  new Toast(getApplicationContext());
        toast.setGravity(Gravity.RIGHT,200,200);
        toast.setDuration(toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }
}
