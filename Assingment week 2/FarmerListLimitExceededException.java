package Exceptions;
public class FarmerListLimitExceededException extends Exception {

    public FarmerListLimitExceededException() {
        super();

    }

    public FarmerListLimitExceededException(String message) {

        System.out.println(message);

    }
}
