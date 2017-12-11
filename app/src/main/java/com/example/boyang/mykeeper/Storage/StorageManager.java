package com.example.boyang.mykeeper.Storage;

import com.example.boyang.mykeeper.Model.AccountsBook;
import com.example.boyang.mykeeper.Model.Entry;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by boyang on 7/12/17.
 */

public class StorageManager {
    File filesDir;
    File saveFile;
    public StorageManager(File filesDir) {
        this.filesDir = filesDir;
        saveFile = new File(filesDir, "accountsBook.txt");
    }

    public void readSave(ArrayList<Entry> entries) {
        int count = 0;
        String description = "";
        String amount;
        try {
            for (String entry : FileUtils.readLines(saveFile)) {
                if (count % 2 == 0) {
                    description = entry;
                } else {
                    amount = entry;
                    entries.add(new Entry(description, amount));
                }
                count++;
            }
        } catch (IOException e) {
            entries = new ArrayList<>();
        }
    }

    public void writeSave(ArrayList<Entry> entries) {
        try {
            FileUtils.writeLines(saveFile, entries);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
