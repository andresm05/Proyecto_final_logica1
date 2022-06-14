/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbook;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Managment {

    public static List<User> users = new ArrayList<>();
    public static List<Book> books = new ArrayList<>();

    //Método para listar los libros en la tabla
    public Object[][] listTable() {
        Object[][] table = new Object[books.size()][5];

        int cont = 0;

        for (Book b : books) {
            table[cont][0] = b.getId();
            table[cont][1] = b.getTitle();
            table[cont][2] = b.getAuthor();
            table[cont][3] = b.getYear();
            table[cont][4] = b.getState();
            cont++;
        }
        return table;
    }

    //Método para mostrar la información de los libro en pantalla
    public String listBooks() {
        String listOfBooks = "";
        int i = 1;
        for (Book b : books) {
            listOfBooks += i + ") " + "id: " + b.getId() + "\ntitulo: "
                    + b.getTitle() + "\nEstado: " + b.getState() + "\n\n";
            i++;
        }
        return listOfBooks;
    }

    //Método para comprobar si el id del libro existe
    public boolean existBookId(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return true;
            }
        }
        return false;
    }

    //Método para verificar que el usuario y contraseña coinciden
    public boolean checkUser(String userPass, String Username) {
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(Username) && u.getPassword().equals(userPass)) {
                return true;
            }
        }
        return false;
    }

    //Método para devolver el libro que coincide con el id
    public Book searchBook(int idBook) {
        for (Book b : books) {
            if (b.getId() == idBook) {
                return b;
            }
        }
        return null;
    }

    //Método para verificar si el usuario ya existe
    public User searchUser(String idUser) {
        for (User u : users) {
            if (u.getId().equals(idUser)) {
                return u;
            }
        }
        return null;
    }

    //Método para obtener la información de un solo libro.
    public String getBookInfo(int idBook) {
        Book b = searchBook(idBook);
        String info = "Título: " + b.getTitle() + "\n Autor: " + b.getAuthor();
        return info;
    }

    //Método para asignatle el libro al usuario
    public void setBookToUser(Book b, User u) {
        //Comprobar que el usuario no tenga libros pendientes por devolver
        if (u.getBookReserved() == null) {
            u.setBookReserved(b);
            //cambiar el estado del libro a reservado
            b.setState("Reservado");
            JOptionPane.showMessageDialog(null, "Libro reservado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Usted ya tiene un libro en préstamo con la biblioteca");
        }

    }

    //Método para devolver un libro prestado por el usuario
    public void setBookToReturn(String idUser, String name, String pass) {
        //Comprobar que el usuario y la contraseña coinciden
        if (checkUser(pass, name)) {
            if (searchUser(idUser) == null) {
                JOptionPane.showMessageDialog(null, "La identificación del usuario es incorrecta", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                User userToReturn = searchUser(idUser);
                //Comprobar si el usuario ya tiene libros prestados
                if (userToReturn.getBookReserved() == null) {
                    JOptionPane.showMessageDialog(null, "Usted no tiene ningún libro prestado");
                } else {
                    //Indicarle al usuario la información del libro que va a devolver y pedirle confirmación
                    int idBook = userToReturn.getBookReserved().getId();
                    int option = JOptionPane.showConfirmDialog(null, "Usted tiene un libro prestado "
                            + "con los siguientes datos:\n\n"
                            + getBookInfo(idBook) + "\n\n¿Desea regresarlo a la Biblioteca?");
                    if (option == 0) {
                        //Cambiar el estado del libro a disponible
                        userToReturn.getBookReserved().setState("Disponible");
                        //Cambiar el estado del usuario a ningún libro reservado
                        userToReturn.setBookReserved(null);
                        JOptionPane.showMessageDialog(null, "Libro regresado con éxito");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y contraseña no coinciden");
        }
    }
}
