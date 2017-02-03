package com.angonmel.Agenda.view;

public class Message {


    public static void printHelp() {
        System.out.println("[H] or [Help] for help menu list.\n" + "[Q] or [Quit] for quit program.\n" + "[L] or [List] for show your contacts list.\n" + "[A] or [Add] for add contact.\n" + "[D] or [Delete] for delete contact.\n");
    }

    public static void printTitle(){
        System.out.println(
                " __   __  _______  __   __  ______      _______  _______  _______  __    _  ______   _______ \n" +
                "|  | |  ||       ||  | |  ||    _ |    |   _   ||       ||       ||  |  | ||      | |   _   |\n" +
                "|  |_|  ||   _   ||  | |  ||   | ||    |  |_|  ||    ___||    ___||   |_| ||  _    ||  |_|  |\n" +
                "|       ||  | |  ||  |_|  ||   |_||_   |       ||   | __ |   |___ |       || | |   ||       |\n" +
                "|_     _||  |_|  ||       ||    __  |  |       ||   ||  ||    ___||  _    || |_|   ||       |\n" +
                "  |   |  |       ||       ||   |  | |  |   _   ||   |_| ||   |___ | | |   ||       ||   _   |\n" +
                "  |___|  |_______||_______||___|  |_|  |__| |__||_______||_______||_|  |__||______| |__| |__|\n" +
                        "<<Welcome to --> Your AGENDA>>\n"+"For show help's menu, please enter [H]elp:\n");
    }

    public static void printQuit(){
        System.out.println("Finishing program..");
    }

    public static void printArchiveSaved(){
        System.out.println("Saving program..");
    }

    public static void  printGetName(){
        System.out.println("Please, write the contact name");

    }

    public static void  printGetPhone(){
        System.out.println("Please, now enter the number phone");

    }

    public static void printGetPositionToDelete(){
        System.out.println("Please enter the number associated with the contact");
    }

    public static void printContactDeleted(){
        System.out.println("Contact deleted");
    }

    public static void printErrorDeleted(){
        System.out.println("Contact not found");
    }

    public static void printErrorNotInt(){
        System.out.println("The character introducided is not an integer");
    }

    public  static void printIncorrectOption(){System.out.println("Incorrect option");}
}


