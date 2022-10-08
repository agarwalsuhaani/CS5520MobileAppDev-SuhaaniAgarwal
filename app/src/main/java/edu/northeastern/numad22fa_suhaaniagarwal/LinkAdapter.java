package edu.northeastern.numad22fa_suhaaniagarwal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class LinkAdapter extends RecyclerView.Adapter<LinkAdapter.LinkViewHolder> {

    List<Link> linkList;
    Context context;
    Intent i;

    public LinkAdapter(List<Link> linkList, Context context) {
        this.linkList = linkList;
        this.context = context;
    }

    @NonNull
    @Override
    public LinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_link_view, parent, false);
        LinkViewHolder holder = new LinkViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinkViewHolder parent, int position) {
        parent.name.setText(linkList.get(position).getName());
        parent.link.setText(linkList.get(position).getLink());
        parent.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse(linkList.get(position).getLink());
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                context.startActivity(webIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return linkList.size();
    }

    public class LinkViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView link;
        ConstraintLayout parentLayout;

        public LinkViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            link = itemView.findViewById(R.id.link);
            parentLayout = itemView.findViewById(R.id.oneLineLinkNameLayout);
        }
    }
}