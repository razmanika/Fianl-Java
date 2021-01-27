package ge.edu.btu;


import org.apache.log4j.Logger;


public class Payment {
    final static Logger logger= Logger.getLogger(Payment.class);
    public static void main(String[] args) {
        Electricity electricity=new Electricity();
        Water water=new Water();
        Payment payment=new Payment();


        pay(electricity.customerNumber("Nikolozi"),electricity.amount(10.5));
        pay(water.customerNumber("Giorgi"),electricity.amount(2.3));





    }
    public static void pay(String name,double x){
        logger.info("გადახდილია "+ name+" "+x);
    }

}
