package com.example.w22st1166794test2;

import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private String category;
    private double price;

    private final String[] catigories = {"Mystery", "Thriller", "Horror", "Historical", "Romance", "Western", "Fantasy", "TextBook", "CookBook", "Self Help", "Fiction", "Indigenous"};

    public Book(String title, String author, String isbn, String category) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setCategory(category);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title.trim();
        if (title.length() >= 4)
            this.title = title;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author.trim();
        if (author.length() >= 2)
            this.author = author;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public String getIsbn() {
        return isbn;
    }


    public static boolean isNumeric(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public void setIsbn(String isbn) {
        if (isbn.length() == 13 && isNumeric(isbn))
            this.isbn = isbn;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (Arrays.asList(catigories).contains(category))
            this.category = category;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        if (price > 0 && price < 2000)
            this.price = price;
        else
            throw new IllegalArgumentException("invalid input");
    }
}
