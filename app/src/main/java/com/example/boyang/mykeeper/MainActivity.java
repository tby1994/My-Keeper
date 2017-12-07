package com.example.boyang.mykeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.boyang.mykeeper.Logic.Command;
import com.example.boyang.mykeeper.Model.Entry;
import com.example.boyang.mykeeper.Storage.StorageManager;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Entry> entries;
    StorageManager storageManager;
    ArrayAdapter<Entry> entryArrayAdapter;
    File filesDir;
    ListView lvEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        updateEntries();
    }

    public void onAddEntry(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityAdd.class);
        //intent.putExtra("entries", entries);
        startActivity(intent);
    }

    public void onDeleteEntry(View view) {
    }

    private void init() {
        filesDir = getFilesDir();
        storageManager = new StorageManager(filesDir);
        entries = new ArrayList<>();
        lvEntries = (ListView)findViewById(R.id.lvEntries);
        entryArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, entries);
        lvEntries.setAdapter(entryArrayAdapter);
        entries = storageManager.readSave(entries);
        entries.add(new Entry("abc 12"));
        entries.add(new Entry("abc", 12));
        entryArrayAdapter.notifyDataSetChanged();
    }

    private void updateEntries() {
        if (getIntent().hasExtra("description") && getIntent().hasExtra("amount")) {
            Bundle bundle = getIntent().getExtras();
            String description = bundle.getString("description");
            int amount = Integer.parseInt(bundle.getString("amount"));
            Command command = new Command(entries);
            entries = command.excute(description, amount);
            entries.add(new Entry("acd, 12"));
            entryArrayAdapter.notifyDataSetChanged();
        }
    }
}
