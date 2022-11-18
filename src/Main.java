import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------- Welcome ------------------------------ \n " +
                "------ Celsius - Fahrenheit / Fahrenheit - Celsius");
        ArrayList<Integer> choiceList = new ArrayList<Integer>(2);
        choiceList.add(1);
        choiceList.add(2);
        int choice;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Choose the conversion mode: \n" +
                    "1- Celsius-Fahrenheit \n2- Fahrenheit-Celsius");
            try{
                // while the choice of user is not 1 or 2, keep asking him for a valid entry
                while (!choiceList.contains(choice = sc.nextInt())) {
                    System.out.println("Invalid entry please enter 1 or 2: ");
                }

                System.out.println("Please enter the temperature to convert");
                int temp_to_convert = sc.nextInt();

                // 1 for C -----> F and 2 for F ------> C
                if (choice == 1) {
                    System.out.println(temp_to_convert + " C ------> " + ((temp_to_convert * 9 / 5) + 32) + " F");
                } else {
                    System.out.println(temp_to_convert + " F ------> " + (temp_to_convert - 32) * 5 / 9 + " C");
                }

                System.out.println("Do you want to convert other temperature ? 1- Yes/ 2- No ");
                int ch;

                // while the choice of user is not 1 or 2, keep asking for a valid entry
                while (!choiceList.contains(ch = sc.nextInt())) {

                    System.out.println("Invalid entry please enter 1 or 2: ");
                }

                // Exit the program if choice is 2
                if (ch == 2){
                    System.out.println("---------------- Good Bye, See You Soon --------------------------");
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid Input, Please Try again");
            }

        }
    }
}