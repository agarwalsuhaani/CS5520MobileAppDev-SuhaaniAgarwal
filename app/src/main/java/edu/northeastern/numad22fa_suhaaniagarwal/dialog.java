package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class dialog extends AppCompatActivity {

    Button submit;
    Button cancel;

    EditText name, link;

    List<Link> linkList;
    MyLinkList myLinkList = (MyLinkList) this.getApplication();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        submit = findViewById(R.id.submit);
        cancel = findViewById(R.id.cancel);
        name = findViewById(R.id.editName);
        link = findViewById(R.id.editLink);

        linkList = myLinkList.getLinkList();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Link newLink = new Link(0, name.getText().toString(), link.getText().toString());
                linkList.add(newLink);

                Snackbar snackbar = Snackbar
                        .make(view, "Link was created", Snackbar.LENGTH_LONG);
                snackbar.show();

                Intent intent = new Intent(dialog.this, LinkCollector.class);
                startActivity(intent);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dialog.this, LinkCollector.class);
                startActivity(intent);
            }
        });


    }
}