package com.example.boyang.mykeeper.Model;

import com.example.boyang.mykeeper.Exceptions.IllegalValueException;

/**
 * Created by boyang on 6/12/17.
 */

public class Entry {
    private Amount amount;
    private Description description;

    public Entry(String input) {
        String[] trimmedInput = input.trim().split(" ");
        this.description = new Description(trimmedInput[0]);
        this.amount = new Amount(Integer.parseInt(trimmedInput[1]));
    }

    public Entry(String description, int amount) {
        this.description = new Description(description);
        this.amount = new Amount(amount);
    }


    public String getDescription() {
        return description.getDescription();
    }

    public int getAmount() {
        return amount.getAmount();
    }

    public void setEntry(int newAmount, String newDescription) {
        amount.setAmount(newAmount);
        description.setDescription(newDescription);
    }

    public void setEntry(int newAmount) {
        amount.setAmount(newAmount);
    }

    public void setEntry(String newDescription) {
        description.setDescription(newDescription);
    }
    @Override
    public String toString() {
        return "Description: " + description + "\n" + "Amount: " + amount;
    }
}
