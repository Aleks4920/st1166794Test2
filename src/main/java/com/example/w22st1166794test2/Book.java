package com.example.w22st1166794test2;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private String category;
    private double price;


    public Book(String title, String author, int isbn, String category) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setCategory(category);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty())
            this.title = title;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.isEmpty())
            this.author = author;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        if (isbn > 0)
            this.isbn = isbn;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (!category.isEmpty())
            this.category = category;
        else
            throw new IllegalArgumentException("invalid input");
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("invalid input");
    }
}
