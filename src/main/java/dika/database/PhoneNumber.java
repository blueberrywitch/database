package dika.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PhoneNumber {

    private static final Logger log = LoggerFactory.getLogger(PhoneNumber.class);
    private static String phoneNumber;

//    public PhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    public static String  isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\+?\\d{11}")){
            if (phoneNumber.charAt(0) == '+') {
                phoneNumber = "+7(" + phoneNumber.substring(2);
            } else {
                phoneNumber = "+7(" + phoneNumber.substring(1);
            }
            StringBuilder stringBuilder = new StringBuilder(phoneNumber);
            stringBuilder.insert(6, ")");
            stringBuilder.insert(10, "-");
            stringBuilder.insert(13, "-");
            phoneNumber = stringBuilder.toString();
        }
        else{
            log.error("Invalid phone number");
        }
        return phoneNumber;
    }
}
