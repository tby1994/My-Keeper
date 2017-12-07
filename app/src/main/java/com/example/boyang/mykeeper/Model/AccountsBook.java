package com.example.boyang.mykeeper.Model;

/**
 * Created by boyang on 7/12/17.
 */

import com.example.boyang.mykeeper.Exceptions.IllegalValueException;

import java.util.ArrayList;
import java.util.List;

/**
 * Represent an accounts book that keeps all the entries
 */
public class AccountsBook {
    ArrayList<Entry> entries;

    public AccountsBook() {
        entries = new ArrayList<>();
    }

    public AccountsBook(List<String> entries) {
        for (String entry : entries) {

        }
    }

    public void addEntry(String description, int amount) throws IllegalValueException {
        entries.add(new Entry(description, amount));
    }

    public Entry deleteEntry(int index) {
        return entries.remove(index);
    }

}
