package baitap.ValidateTelNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelNumberValid {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_NUMBER_VALID = "^[(][0-9]{2}[)][-][(][0-9]{10,11}[)]$";
    public TelNumberValid(){
        pattern = Pattern.compile(PHONE_NUMBER_VALID);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
