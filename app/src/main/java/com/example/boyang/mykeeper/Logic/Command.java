package com.example.boyang.mykeeper.Logic;

import com.example.boyang.mykeeper.Model.Entry;

import java.util.ArrayList;

/**
 * Created by boyang on 7/12/17.
 */

public class Command {
    ArrayList<Entry> entries;

    public Command (ArrayList<Entry> entries) {
        this.entries = entries;
    }

    public ArrayList<Entry> excute(String description, int amount) {
        if (description.equals(null) || amount == 0) {
            return entries;
        }
        entries.add(new Entry(description, amount));
        return entries;
    }

    public ArrayList<Entry> excute(int index) {
        entries.remove(index);
        return entries;
    }
}
