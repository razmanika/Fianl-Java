package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passanger passanger=new Passanger("luka",true);
        Passanger passanger1=new Passanger("Giorgi",false);
        Train train=new Train();
        train.addPassanger(passanger);
        train.addPassanger(passanger1);


    }
}
