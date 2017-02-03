package com.angonmel.Agenda.view;


import java.util.Scanner;

public class Prompt {
    public static  String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static  int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }





}
