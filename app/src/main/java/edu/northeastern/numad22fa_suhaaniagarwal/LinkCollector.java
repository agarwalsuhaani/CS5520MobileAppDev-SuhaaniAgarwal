package edu.northeastern.numad22fa_suhaaniagarwal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class LinkCollector extends AppCompatActivity {

    private static final String TAG = "Link App";
    FloatingActionButton fab;
    List<Link> linkList;

    private RecyclerView linkRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    MyLinkList myLinkList = (MyLinkList) this.getApplication();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_collector);

        fab = findViewById(R.id.add_fab);
        linkRecyclerView = findViewById(R.id.rvContacts);
        linkList = myLinkList.getLinkList();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinkCollector.this, dialog.class);
                startActivity(intent);
            }
        });

        linkRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        linkRecyclerView.setLayoutManager(layoutManager);

        adapter = new LinkAdapter(linkList, LinkCollector.this );
        linkRecyclerView.setAdapter(adapter);
    }
}