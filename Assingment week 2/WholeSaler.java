package Person;

import java.util.LinkedList;
import java.util.List;

import Exceptions.FarmerListLimitExceededException;

public class WholeSaler extends FarmerListLimitExceededException implements Person {
    String name;
    long Phone;

    public List<Farmer> farmers = new LinkedList<Farmer>();

    public WholeSaler(String string, Long i) {
        this.name = string;
        this.Phone = i;
    }

    public void addFarmer(Farmer f) throws FarmerListLimitExceededException {
        // super.addFarmer();

        if (farmers.size() > 4) {
            throw new FarmerListLimitExceededException();

        } else
            farmers.add(f);
            System.out.println("Farmer "+f.getName()+" added.");

    }

    @Override
    public void addWholesaler() {
        // TODO Auto-generated method stub

    }

}
