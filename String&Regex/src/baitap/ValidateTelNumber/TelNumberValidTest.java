package baitap.ValidateTelNumber;

public class TelNumberValidTest {
    private static final String[] telNumbers = {"(84)-(0389484742)","(a8)-(278972222)","(09)-(uuhihhhihhhu)"};

    public static void main(String[] args) {
        TelNumberValid telNumberValid = new TelNumberValid();
        for (String telNumber : telNumbers) {
            boolean isValid = telNumberValid.validate(telNumber);
            System.out.println("Phone number " + telNumber + " is valid: " + isValid );
        }
    }
}
