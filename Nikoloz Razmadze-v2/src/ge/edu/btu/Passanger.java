package ge.edu.btu;

public class Passanger {
    String name;
    Boolean ticket;

    public void getName(){
        System.out.println(name);
    }

    public Passanger(String name, Boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public void haveTicket(){
        System.out.println(ticket);
    }
}
