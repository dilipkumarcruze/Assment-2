package Person;

import Exceptions.FarmerListLimitExceededException;

interface Person {
   
    void addFarmer(Farmer f) throws FarmerListLimitExceededException;

    void addWholesaler();
}