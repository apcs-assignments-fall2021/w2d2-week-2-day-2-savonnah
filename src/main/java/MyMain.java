import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number between 0.0 and 1000000.0");
        double input = scan.nextDouble();
        if (input>0.0 && input<=1000000.0){
           return input;
        }
        else{
            while (input<0.0 || input>1000000.0){
                System.out.println("Please input a number between 0.0 and 1000000.0");
                input = scan.nextDouble();
            }
            return input;
        }
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int count = 0;
        double monies = money;
        while (monies>0.25 || Math.abs(monies-0.25) < 0.00001) {
            monies = monies - 0.25;
            count++;
        }
        return count;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int count = 0;
        double monies = money;
        while (monies>0.10) {
            monies = monies - 0.10;
            count++;
        }
        return count;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();
        /*
        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502
        */
        scan.close();
    }
}