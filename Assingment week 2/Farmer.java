package Person;

public class Farmer implements Person {
    String name;
    Long Phone;

    public Farmer(String name, Long i) {
        this.name = name;
        this.Phone = i;
    }

    @Override
    public void addWholesaler() {

    }

    @Override
    public void addFarmer(Farmer f) {

    }

    public String getName() {
        return this.name;
    }

    public long getContact() {
        return this.Phone;
    }

}
