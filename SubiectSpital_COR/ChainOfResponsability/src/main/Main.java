package main;

import clase.*;

import java.util.Arrays;
import java.util.List;

public class Main{
    static void main(String[] args) {
        Client client1=new Client("Client 1",null,"mail@ase.ro");
        Client client2=new Client("Client 2","0771609667",null);
        Client client3=new Client("Client 3",null,null);

        Notificator notificatorSMS=new NotificatorSMS();
        Notificator notificatorEmail=new NotificatorEmail();
        Notificator notificatorManager=new NotificatorManager();


        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        List<Client> clienti= Arrays.asList(client1,client2,client3);
        clienti.forEach(client->notificatorSMS.trimiteNotificare(client,"Ai primit o notificare."));
    }
}