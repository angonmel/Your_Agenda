package com.angonmel.Agenda.managers;

import com.angonmel.Agenda.model.Contacts;
import com.angonmel.Agenda.util.PrintAgenda;
import com.angonmel.Agenda.view.Message;
import com.angonmel.Agenda.view.Prompt;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;


public class ContactManager {

    private static LinkedList<Contacts> yourList = new LinkedList<>();
    public static void print(){
        for (Contacts contacts : yourList){
            System.out.println( getYourList().indexOf(contacts) + " : " + contacts.getName() + " --> " + contacts.getPhone());
        }
    }

    public  void add(Contacts contacts){this.yourList.add(contacts);}



    public static LinkedList<Contacts> getYourList() {

        return yourList;
    }

    public void setYourList(LinkedList<Contacts> yourList) {
        this.yourList = yourList;
    }

    public void delete(Contacts contacts){this.yourList.remove(contacts);
    }

    public static void saveContact() throws IOException {
        List<String> contactname= new LinkedList<>();
        List<String> contactphone= new LinkedList<>();

        for (int i = 0; i < yourList.size() ; i++) {
            contactname.add(yourList.get(i).getName());
            contactphone.add(yourList.get(i).getPhone());

        }
        PrintAgenda.createFile("ContactsNames.txt", contactname);
        PrintAgenda.createFile("ContactsPhones.txt", contactphone);
    }

    public static void readContact(){
        if(PrintAgenda.readFile("ContactsNames.txt")!= null) {
            List contactsName = PrintAgenda.readFile("ContactsNames.txt");
            List contactsPhone = PrintAgenda.readFile("ContactsPhones.txt");

            for (int i = 0; i < contactsName.size(); i++) {
                Contacts contacts = new Contacts(contactsName.get(i).toString(), contactsPhone.get(i).toString());
                yourList.add(contacts);


            }
        }
    }

    public static Contacts addContact(){

        Message.printGetName();
       String nameContact = Prompt.read();
       Message.printGetPhone();
       String phoneContact = Prompt.read();


       Contacts contacts = new Contacts(nameContact,phoneContact);
       yourList.add(contacts);


    return contacts;
    }

    public static void deleteContact(ContactManager contacts){

        Message.printGetPositionToDelete();
        try{
            int positionToDelete = Prompt.readInt();

            if(positionToDelete >= 0 && positionToDelete < contacts.getYourList().size()){

                contacts.getYourList().remove(positionToDelete);
                Message.printContactDeleted();

            }else{
                Message.printErrorDeleted();
            }
        }catch (InputMismatchException e){
            Message.printErrorNotInt();
        }









   }



}
