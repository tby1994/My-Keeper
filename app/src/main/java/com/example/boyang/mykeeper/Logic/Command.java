package com.example.boyang.mykeeper.Logic;

import com.example.boyang.mykeeper.Model.Entry;
import com.example.boyang.mykeeper.Storage.StorageManager;

import java.util.ArrayList;

/**
 * Created by boyang on 7/12/17.
 */

public class Command {

/*
    public ArrayList<Entry> excute(String description, int amount) {
        if (description.equals(null) || amount == 0) {
            return entries;
        }
        entries.add(new Entry(description, amount));
        return entries;
    }
*/
    public void excute(String description, float amount, ArrayList<Entry> entries) {
        if (description.equals(null) || amount == 0) {
            //return entries;
            return;
        }
        entries.add(new Entry(description, amount));
        //return entries;
    }

    public ArrayList<Entry> excute(int index , ArrayList<Entry> entries) {
        entries.remove(index);
        return entries;
    }
}
