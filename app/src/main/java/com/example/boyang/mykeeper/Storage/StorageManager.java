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

    public ArrayList<Entry> readSave(ArrayList<Entry> entries) {
        try {
            for (String entry : FileUtils.readLines(saveFile)) {
                entries.add(new Entry(entry));
            }
        } catch (IOException e) {
            entries = new ArrayList<>();
        }
        return entries;
    }

    public void writeSave(ArrayList<Entry> entries) {
        try {
            FileUtils.writeLines(saveFile, entries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
