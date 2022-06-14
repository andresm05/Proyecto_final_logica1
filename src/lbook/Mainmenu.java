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
public class Mainmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear datos de prueba
        Book bookSample = new Book(1, "Mecánica", 800, "Stewart", 2000);
        Managment.books.add(bookSample);
        User userSample = new User("jaime", "muñoz", "100", "123");
        Managment.users.add(userSample);
        Library window = new Library();
        window.setVisible(true);
    }
    
}
