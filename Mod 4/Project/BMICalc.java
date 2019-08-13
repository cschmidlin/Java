import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

public class BMICalc {
public static void main(String[] args) throws FileNotFoundException, IOException{
    int BMI = 0;
    //Creating the scanner for getting user's info
    Scanner in = new Scanner(System.in);
    
    char token = 's';
    do{
        System.out.println("Start here!");
        //Getting user's name
        System.out.print("Please input your first name: ");
        String fname = in.nextLine();
        System.out.print("Please input your last name: ");
        String lname = in.nextLine();

        //Getting user's birthdate
        System.out.print("Please input your birthdate (MM/DD/YYYY): ");
        String birthdate = in.nextLine();

        //Getting user's weight
        System.out.print("Please input your weight: ");
        int weight = in.nextInt();

        //Getting user's height
        System.out.print("Please input your height in inches: ");
        int height = in.nextInt();

        //Calculating the BMI of the user
        try {
            BMI = 703 * weight / (height*height);
        } catch (Exception e){
            BMI = -1;
            System.out.println("The exception is " + e.getMessage());
            System.out.println("The exception code is " + e.toString());
        } finally {
            if (BMI == -1){
                System.out.println("Please start over.");
                System.exit(0);
            } 
        }

        FileWriter fw = new FileWriter("BMI.csv");

        //Create headers in the CSV file
        fw.append("Name" + ",");
        fw.append("Birthday" + ",");
        fw.append("Weight" + ",");
        fw.append("Height" + ",");
        fw.append("BMI");
        fw.append("\n");

        //Input info
        fw.append(fname + " " + lname + ",");
        fw.append(birthdate + ",");
        fw.append(weight + ",");
        fw.append(height + ",");
        fw.append(BMI + ",");

        fw.flush();
        fw.close();

        //Printing out the user's info 
        System.out.println(fname + " " + lname);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + BMI);

        //Printing out the user's BMI Score
        if (BMI < 18.5){
            System.out.println("BMI Score is Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("BMI Score is Normal");
        } else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("BMI Score is Overweight");
        } else {
            System.out.println("BMI Score is Obese");
        }

        //Printing out the user's insurance payment category based on the BMI
        if (BMI < 18.5){
            System.out.println("Insurance payment category is low.");
        } else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Insurance payment category is low.");
        } else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Insurance payment category is high.");
        } else {
            System.out.println("Insurance payment category is highest.");
        } 
        char userInput = 's';
        System.out.print("Another? Press anything to continue and press 'q' to stop. ");
        userInput = in.next().charAt(0);
        if (userInput == 'q'){
            token = 'q';
        } 
    } while (token != 'q');
}
}
