package com.example.boyang.mykeeper.Model;

/**
 * Created by boyang on 6/12/17.
 */

import com.example.boyang.mykeeper.Exceptions.IllegalValueException;

/**
 * Represent the amount of the entry
 */
public class Amount {
    private int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.valueOf(amount);
    }
}
