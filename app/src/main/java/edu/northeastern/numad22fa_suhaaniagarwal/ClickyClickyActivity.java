package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClickyClickyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicky_clicky);
    }

    public void buttonAClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Pressed: A");
    }

    public void buttonBClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Pressed: B");
    }

    public void buttonCClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Pressed: C");
    }

    public void buttonDClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Pressed: D");
    }

    public void buttonEClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Pressed: E");
    }

    public void buttonFClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setText("Pressed: F");
    }
}