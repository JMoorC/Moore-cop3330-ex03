/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = inScan.nextLine();
        System.out.print("Who said it? ");
        String author = inScan.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");

    }
}
