/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbook;

/**
 *
 * @author HOME
 */
public class Book {
    
    private int id;
    private String title;
    private int pages;
    private String author;
    private int year;
    private String State;

    public Book(int id, String title, int pages, String author, int year) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.year = year;
        this.State = "Disponible";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
}
