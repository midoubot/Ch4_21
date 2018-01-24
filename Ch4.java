/*
(Check SSN) Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD,
 where D is a digit. Your program should check whether the input is valid.
 */
import java.util.regex.*;
import java.util.Scanner;

public class Ch4 {

    public static boolean ssnCheck(String ssnNum){

        String pattern = "^\\d{3}-\\d{2}-\\d{4}$";
        CharSequence userSsnInput = ssnNum;

        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(userSsnInput);

        boolean validSSN = false;{}

        if (match.matches()){
            validSSN = true;
        }
        return validSSN;
    }
    public static void printSSNValidity(){
        System.out.println("Please enter your SSN.");
        System.out.println("In the format DDD-DD-DDDD");
        Scanner ssn = new Scanner(System.in);
        String ssnNum = ssn.nextLine();

        if(ssnCheck(ssnNum)) {
            System.out.println("SSN is valid!");
        }
        else {
            System.out.println("SSN is invalid");
        }
    }
    public static void main(String[] args) {
        printSSNValidity();
    }
}
