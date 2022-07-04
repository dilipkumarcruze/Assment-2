import Person.Farmer;
import Person.WholeSaler;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("Vijay Antony",(long) 1222233344);

        Farmer farmer1 = new Farmer("Ram kumar", (long) 7358340088);
        Farmer farmer2 = new Farmer("Dilipkumar", (long) 8825927537);
        Farmer farmer3 = new Farmer("Pavan", (long) 7401739800);
        Farmer farmer4 = new Farmer("Ganesh", (long) 8890765312);
        Farmer farmer5 = new Farmer("Pravin", (long) 9805467801);
        Farmer farmer6 = new Farmer("Roger Antony", (long) 9444980951);
        try {
            wholeSaler1.addFarmer(farmer1);
            wholeSaler1.addFarmer(farmer2);
            wholeSaler1.addFarmer(farmer3);
            wholeSaler1.addFarmer(farmer4);
            wholeSaler1.addFarmer(farmer5);
            wholeSaler1.addFarmer(farmer6);

        } catch (Exception e) {
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }

        System.out.println("List of Farmers: ");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n Farmer Name: %s and Phone Number: %s", f.getName(), f.getContact());
        }

    }

}
