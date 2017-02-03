package com.angonmel.Agenda;


import com.angonmel.Agenda.controller.ControlAgenda;
import com.angonmel.Agenda.view.Message;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Message.printTitle();

        ControlAgenda agenda = new ControlAgenda();
        agenda.switchMenu();
}
}