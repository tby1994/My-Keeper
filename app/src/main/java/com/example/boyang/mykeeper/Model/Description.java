package com.example.boyang.mykeeper.Model;

/**
 * Created by boyang on 6/12/17.
 */

import com.example.boyang.mykeeper.Exceptions.IllegalValueException;

/**
 * Represent the description of the entry
 */
public class Description {

    public static String MESSAGE_DESCRIPTION_CONSTRAINTS =
            "Description should not be blank";
    private String description;

    public Description(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
