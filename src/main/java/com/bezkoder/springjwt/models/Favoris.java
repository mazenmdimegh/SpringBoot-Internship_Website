package com.bezkoder.springjwt.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Favoris {
    private ArrayList<Long> ids;
    public ArrayList<Long> getids() {
        return this.ids;
    }

    public void setids(ArrayList<Long> ids) {
        this.ids = ids;
    }
}
