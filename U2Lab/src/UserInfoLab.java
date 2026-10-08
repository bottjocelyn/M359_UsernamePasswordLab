import java.util.Scanner;

public class UserInfoLab {
    public static void main(String[] args) {
        // Part 1
        // Create a Scanner for keyboard input

        Scanner input = new Scanner(System.in);

        // Ask the user to enter their first and last name and pass these

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        String username = generateUsername(firstName, lastName);

        System.out.println("Username: " + username);
        System.out.println();
        // values to the generateUsername method and save the returned result.

        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        boolean validPassword = validatePassword(password);
        if(validPassword){
            System.out.println("Valid Password. Checking Credit Card");
        }
        else{
            System.out.print("You must enter a valid password before entering a Credit Card.");
        }
        // The validatePassword method will check if the password meets the criteria:

        // Part 3
        if(validPassword){
            System.out.print("Enter your credit card number: ");
            String creditCard = input.nextLine();

            String maskedCard = maskCreditCard(creditCard);

            if(maskedCard.equals("N/A")){
                System.out.println("Invalid Credit Card Number");
            }
            else{
                System.out.println();
                System.out.print("Final Details:\n" + "Username: " + username + "\n" + "Credit card: " + maskedCard);
            }
        }
        // If the user entered a valid password in step 2, then ask the user to enter their
        // credit card number and pass this value to the maskCreditCard method.

        // Part 4
        // If the user entered a valid password AND valid credit card number, display the output
        // as shown in the demo video
        // https://drive.google.com/file/d/1sMOw5wkOgSfuUcvQhFyZ5flnv_d9qQd3/view?usp=sharing

    }

    public static String generateUsername(String firstName, String lastName) {
        String result = "";

        if(firstName.length() >= 3){
            if(lastName.length() >= 3){
                result+= firstName.substring(0,3) + lastName.substring(0,3);
            }
            else{
                result+= firstName.substring(0,3) + lastName;
            }
        }
        else{
            if(lastName.length() >= 3){
                result += firstName + lastName.substring(0,3);
            }
            else{
                result += firstName + lastName;
            }
        }

        result = result.toLowerCase();

        return result;
    }

    public static boolean validatePassword(String password) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean longPass = true;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        String print = "";

        if(password.length() < 8){
            longPass = false;
        }

        for(int i = 0; i<upperCase.length(); i++){
            if(password.indexOf(upperCase.substring(i,i+1)) > -1){
                hasUpperCase = true;
            }
        }

        if (containsDigit(password)) {
            hasDigit = true;
        }

        if(longPass && hasDigit && hasUpperCase){
            return true;
        }
        else{

            if(!longPass){
                print += "\nYour password is not at least 8 characters long.";
            }
            if(!hasUpperCase){
                print += "\nYour password does not have uppercase letter.";
            }
            if(!hasDigit){
                print += "\nYour password does not have a number.";
            }

            System.out.println(print);
            return false;
        }


    }

    public static String maskCreditCard(String creditCardNumber) {

        if(creditCardNumber.length() == 16){
            if(allDigits(creditCardNumber)){
                return "**** **** **** " + creditCardNumber.substring(12);
            }
            else{
                return "N/A";
            }
        }
        else{
            return "N/A";
        }
    }

    /**
     This method verifies that the string contains at least one numeric digit
     @param str The string to check
     @return true or false if a digit is present
     */
    public static boolean containsDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    /**
     * Checks if the entire String is all numerical
     * @param str The string to check
     * @return true or false if the string is ALL digits
     */
    public static boolean allDigits(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

}
