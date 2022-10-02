package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class LinkCollector extends AppCompatActivity {
    RecyclerView linkRecyclerView;
    FloatingActionButton fab;
    String link;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_collector);

        fab = findViewById(R.id.add_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(LinkCollector.this);
                dialog.setContentView(R.layout.dialog_box);
                EditText edtLink = dialog.findViewById(R.id.editLink);
                EditText edtName = dialog.findViewById(R.id.editName);
                Button submit = dialog.findViewById(R.id.submit);

                name = edtName.getText().toString();
                link = edtLink.getText().toString();

                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                //openDialog();
                dialog.show();
            }

//            public void openDialog() {
//                DialogBox dialogBox = new DialogBox();
//                dialogBox.show(getSupportFragmentManager(), "Dialog Box");
//            }
        });


    }
}