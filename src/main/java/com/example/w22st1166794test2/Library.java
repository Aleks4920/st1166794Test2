package com.example.w22st1166794test2;

import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> books;

    public Library(String streetAddress) {
        setAddress(streetAddress);
        this.books = new ArrayList<Book>();
    }

    public String geAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() >= 10)
            this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }


    public double inventoryValue(){
        double totalValue = 0;
        for(Book book : books){
            totalValue += book.getPrice();
        }
        return totalValue;
    }


    public ArrayList<String> getCategories(){
        ArrayList<String> categories = new  ArrayList<String>();
        for (Book book : books){
            if (!book.getCategory().contains(book.getCategory()))
                categories.add(book.getCategory());
        }
        return categories;
    }

    public ArrayList<String> getBooksInCategory(string category){
        ArrayList<String> booksInCategory = new ArrayList<String>();
        for (Book book : books){
            if (book.getCategory == category)
                booksInCategory.add(book.getTitle());
        }
        return booksInCategory;
    }

}
