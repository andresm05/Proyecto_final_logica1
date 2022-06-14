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
public class User {

    private String name;
    private String lastname;
    private String id;
    private String password;
    private Book bookReserved;

    public User(String name, String lastname, String id, String password) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.password = password;
        this.bookReserved = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Book getBookReserved() {
        return bookReserved;
    }

    public void setBookReserved(Book bookReserved) {
        this.bookReserved = bookReserved;
    }

}
