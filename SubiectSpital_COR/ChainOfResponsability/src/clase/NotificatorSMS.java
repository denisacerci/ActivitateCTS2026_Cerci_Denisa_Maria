package clase;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getTelefon()!=null && !client.getTelefon().isEmpty()){
            System.out.println(client.getNume()+" a primit notificarea "+mesaj+" prin SMS. ");
        } else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client,mesaj);
        }
        else{
            System.out.println("Clientul nu are numar de telefon si nu exista succesor.");
        }
    }
}
