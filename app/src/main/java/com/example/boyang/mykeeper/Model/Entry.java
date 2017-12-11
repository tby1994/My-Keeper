package com.example.boyang.mykeeper.Model;

import com.example.boyang.mykeeper.Exceptions.IllegalValueException;

/**
 * Created by boyang on 6/12/17.
 */

public class Entry {
    private Amount amount;
    private Description description;

    public Entry(String description, String amount) {
        String[] trimmedDescription = description.split(" ");
        String[] trimmedAmount = amount.split(" ");
        this.description = new Description(trimmedDescription[1].trim());
        this.amount = new Amount(Float.parseFloat(trimmedAmount[1].trim()));
    }

    public Entry(String description, float amount) {
        this.description = new Description(description);
        this.amount = new Amount(amount);
    }


    public String getDescription() {
        return description.getDescription();
    }

    public float getAmount() {
        return amount.getAmount();
    }

    public void setEntry(int newAmount, String newDescription) {
        amount.setAmount(newAmount);
        description.setDescription(newDescription);
    }

    public void setEntry(float newAmount) {
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
