package com.angonmel.Agenda.controller;


import com.angonmel.Agenda.managers.CommandParser;
import com.angonmel.Agenda.managers.ContactManager;
import com.angonmel.Agenda.model.Command;

import com.angonmel.Agenda.view.Message;
import com.angonmel.Agenda.view.Prompt;

import java.io.IOException;



public class ControlAgenda {

ContactManager yourList = new ContactManager();


    public void switchMenu()throws IOException{
        boolean end = false;
        ContactManager.readContact();

        while (!end){
        String command = Prompt.read();
        Command com = CommandParser.parse(command);
        switch (com){
            case HELP:
                Message.printHelp();
                break;

            case QUIT:
                Message.printQuit();
                end = true;
                ContactManager.saveContact();
                Message.printArchiveSaved();
               System.exit(0);
               break;

            case LIST:
               ContactManager.print();
                break;

            case ADD:

            ContactManager.addContact();

                break;

            case DELETE:
                ContactManager.deleteContact(yourList);


                break;

            default:
                Message.printIncorrectOption();


            }


        }

    }


}
