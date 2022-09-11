package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v) {
        toastMsg("Suhaani Agarwal - agarwal.suh@northeastern.edu");
    }

    public void textMessage(View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Hello World!");
        textView.setTextColor(Color.RED);
    }

    public void toggleButton(View v) {
        ToggleButton simpleToggleButton = (ToggleButton) findViewById(R.id.simpleToggleButton);
        Boolean ToggleButtonState = simpleToggleButton.isChecked();
    }
}