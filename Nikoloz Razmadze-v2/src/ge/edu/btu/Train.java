package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    List<Passanger> passangerList=new ArrayList<>();
    Boolean addPassanger(Passanger passanger){
        if (passanger.haveTicket());
        {
            passangerList.add(passanger);
            return true;
        }

        void getPassangerList()
        {
            for (Passanger x: passangerList){
                System.out.println(x.toString());
            }
        }




    }

}
