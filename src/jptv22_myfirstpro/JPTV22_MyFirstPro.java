/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22_myfirstpro;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV22_MyFirstPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String firstname = scanner.nextLine();
        System.out.println("name:");
        String lastname = scanner.nextLine();
        System.out.println("lastname:");
        System.out.println("Hi! " + firstname + " " + lastname );
    }
    
}
