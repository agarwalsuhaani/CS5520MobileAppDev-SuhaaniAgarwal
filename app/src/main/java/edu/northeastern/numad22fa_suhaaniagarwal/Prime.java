package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Prime extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Handler textHandler = new Handler();
    private Handler textHandlerCurrent = new Handler();
    private TextView txtStatus, txtPrime;
    private Button terminate;
    private volatile boolean stop = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);
        txtStatus = findViewById(R.id.txtView_status);
        terminate = findViewById(R.id.btn_terminate);
        txtPrime = findViewById(R.id.txt_prime);
    }

    public void runOnRunnableThread (View view) {
        RunnableThread runnableThread = new RunnableThread();
        new Thread(runnableThread).start();
    }

    public void stopThread(View view) {
        stop = true;
    }

    class RunnableThread implements Runnable {
        @Override
        public void run() {
            int i;
            for (i = 3; i < 1000; i+=2) {
                int current = i;
                if(stop) {
                    return;
                }
                textHandlerCurrent.post(new Runnable() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void run() {
                        txtStatus.setText("Current Number Checked " + current);
                    }
                });
                int count = 0;
                for (int num = i; num>=1; num--) {
                    if(i % num == 0) {
                        count ++ ;
                    }
                }
                if (count == 2 ) {
                    int temp = i;
                    textHandler.post(new Runnable() {
                        @SuppressLint("SetTextI18n")
                        @Override
                        public void run() {
                            txtPrime.setText("Latest Prime Number" + temp);
                        }
                    });
                    Log.d(TAG, "Running on a different thread using Runnable Interface: " + i);
                    try {
                        Thread.sleep(1000); //Makes the thread sleep or be inactive for 10 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Closing Activity")
                .setMessage("Are you sure you want to close this activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

}