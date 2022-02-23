package com.example.w22st1166794test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class MainController implements Initializable{

    @FXML
    private Label addressLabel;

    @FXML
    private Label numberBooksLabel;

    @FXML
    private Label valueBooksLabel;

    @FXML
    private Label ISBNLabel;


    @FXML
    private Label authorLabel;

    @FXML
    private Label categoryLabel;


    @FXML
    private Label priceLabel;

    @FXML
    private Label titleLabel;


    private Library library;
    private int numBooks;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        library = new Library("60 Worsley St, Barrie, ON, L4M 1L6");
        Book book1 = new Book("Intro to Java","Jaret Wright","1234567891011",79.99,"TextBook");
        Book book2 = new Book("The Maid","Nita Prose","9780735245259",24.95,"Fiction");
        Book book3 = new Book("Atomic Habits","James Clear","9780735211292",21.88,"Self Help");
        Book book4 = new Book("Plant You","Carleigh Bodrug","9780306923043",38.00,"CookBook");
        Book book5 = new Book("Five Little Indians","Michelle Good","9781443459181",18.39,"Indigenous");
        Book book6 = new Book("The Christie Affair","Nina De Gramont","9781250282132",38.00,"Romance");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);


        loadBooksData(library);

    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @FXML
    private void loadBooksData(Library library){

        addressLabel.setText(library.getAddress());

        numBooks = library.getNumBooks();
        numberBooksLabel.setText(String.valueOf(numBooks));

        valueBooksLabel.setText("$ " + String.valueOf(df.format(library.inventoryValue())));
        nextBook();



    }
     private int i = 0;
    @FXML
    void nextBook(){
        Book book;

        if (i < numBooks){
            book = library.getBooks().remove(0);
            i++;
        }
        else
            return;

        titleLabel.setText(book.getTitle());
        authorLabel.setText(book.getAuthor());
        ISBNLabel.setText(book.getIsbn());
        categoryLabel.setText(book.getCategory());
        priceLabel.setText(String.valueOf(df.format(book.getPrice())));
    }




}