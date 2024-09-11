package com.badorek.coursework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListAdapter;

public class ListActivity extends AppCompatActivity {

    private Storage storage;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        storage = Storage.getInstance();

        recyclerView = findViewById(R.id.ListRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), storage.getUsers()));
    }
}