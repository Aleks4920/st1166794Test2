package com.example.w22st1166794test2;

import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<String> books;

    public Library(String streetAddress) {
        setAddress(streetAddress);
        this.books = new ArrayList<String>();
    }

    public String geAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() >= 10)
            this.address = address;
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }
}
