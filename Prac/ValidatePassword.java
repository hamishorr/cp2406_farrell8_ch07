//at least 2 lower case and 2 digits
import java.util.*;

public class ValidatePassword {

    public static void main(String[] args) {

        boolean valid = false;
        while (!valid) {
            System.out.println("Enter Password:");
            Scanner input = new Scanner(System.in);
            String pass = input.nextLine();
            String lowerCase = "";
            String numbers = "";
            String currentChar = "";
            for(int i = 0; i<pass.length(); i=i+1){
                currentChar = pass.substring(i,1+i);
                if(currentChar.equals(currentChar.toLowerCase())){
                  lowerCase = lowerCase + currentChar;
                }

                else if (isInt(currentChar)){
                    numbers = numbers + currentChar;
                }

            }
            if(lowerCase.length() >= 2 && numbers.length() >= 2){
                valid = true;
                System.out.println("Password is valid");
            }
            else{System.out.println("Invalid password!");}
        }}

        static boolean isInt(String val){
            try{
                int i = Integer.parseInt(val);
                return true;
            }
            catch (NumberFormatException er) {
                return false;
            }
        }

    }



