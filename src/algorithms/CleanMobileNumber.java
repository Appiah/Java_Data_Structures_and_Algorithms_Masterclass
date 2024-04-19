package algorithms;

public class CleanMobileNumber {

    public static void main (String [] args){

        String phoneNumber_str = "+23 4 465 7834 7858";

        System.out.println("After cleaning this : "+ phoneNumber_str+", \n we get : "+removePlusSign(phoneNumber_str));

    }

    public static String removePlusSign(String phoneNumber){
        return phoneNumber.replace(" ", "").replace("+", "");
    }

}
