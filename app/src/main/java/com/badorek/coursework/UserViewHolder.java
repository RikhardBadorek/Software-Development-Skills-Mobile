package com.badorek.coursework;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView name;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.nameTextView);
    }
}
