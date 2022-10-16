package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    public void clickActivity(View v) {
        Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClickyClickyActivity.class));
            }
        });
    }

    public void linkCollector(View v) {
        Button btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinkCollector.class));
            }
        });
    }

    public void primeDirective(View v) {
        Button btnPrime = (Button) findViewById(R.id.primeDirective);
        btnPrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Prime.class));
            }
        });
    }

    public void locationUpdate(View v) {
        Button btnLocation = (Button) findViewById(R.id.btn_location);
        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Location.class));
            }
        });
    }
}