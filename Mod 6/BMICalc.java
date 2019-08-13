import java.util.Scanner;
import java.io.*;

interface BMI{
    public void getInfo();
    public void calcBMI();
    public void createFile();
    public void appendToFile();
    public void consolePrint();
    public void runProgram();
}

public class BMICalc implements BMI{
    String file = "BMI.csv";
    int BMI = 0;
    Scanner in = new Scanner(System.in);
    
    String name = "";
    String birthdate = "";
    int weight = 0;
    int height = 0;
    
    public void getInfo(){
        in.nextLine();
        System.out.print("Name: ");
        name = in.nextLine();

        System.out.print("Birthdate: ");
        birthdate = in.nextLine();

        System.out.print("Weight: ");
        weight = in.nextInt();

        System.out.print("Height: ");
        height = in.nextInt();
    }

    public void calcBMI(){
        try{
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
        
    }
    
    public void createFile(){
        try{
            FileWriter fw = new FileWriter(file, true);
            
            //Create headers in the CSV file
            fw.append("Name" + ",");
            fw.append("Birthday" + ",");
            fw.append("Weight" + ",");
            fw.append("Height" + ",");
            fw.append("BMI");
            fw.append("\n");
            
            fw.append("\n");
            fw.flush();
            fw.close();
        } catch (Exception e){
            System.out.println("The exception is " + e.getMessage());
            System.out.println("The exception code is " + e.toString());
        }
    }

    public void appendToFile(){
        
        try {
            FileWriter fw = new FileWriter(file, true);
            
            //Input info
            fw.append(name + ",");
            fw.append(birthdate + ",");
            fw.append(weight + ",");
            fw.append(height + ",");
            fw.append(BMI + ",");
            

            if (BMI < 18.5){
                fw.append("BMI Score is Underweight" + ",");
            } else if (BMI >= 18.5 && BMI <= 24.9){
                fw.append("BMI Score is Normal" + ",");
            } else if (BMI >= 25 && BMI <= 29.9){
                fw.append("BMI Score is Overweight" + ",");
            } else {
                fw.append("BMI Score is Obese" + ",");
            }

            if (BMI < 18.5){
                fw.append("Insurance payment category is low.");
            } else if (BMI >= 18.5 && BMI <= 24.9){
                fw.append("Insurance payment category is low.");
            } else if (BMI >= 25 && BMI <= 29.9){
                fw.append("Insurance payment category is high.");
            } else {
                fw.append("Insurance payment category is highest.");
            } 
            
            fw.append("\n");
            fw.append("\n");
            fw.flush();
            //fw.close();
        } catch (Exception e){
            System.out.println("The exception is " + e.getMessage());
            System.out.println("The exception code is " + e.toString());
        }
    }
    public void consolePrint(){
        //Printing out the user's info 
        System.out.println(name);
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
    }
    
    public void runProgram(){
        char token = 's';
        System.out.println("New file? ");
        char input = in.next().charAt(0);
        if (input == 'y' || input == 'Y'){
            createFile();
            
            do {
                getInfo();
                calcBMI();
                consolePrint();
                appendToFile();
                System.out.println("Continue? ");
                token = in.next().charAt(0);
                in.nextLine();
            } while (token != 'q');
        } else {
            do {
                getInfo();
                calcBMI();
                consolePrint();
                appendToFile();
                System.out.println("Continue? ");
                token = in.next().charAt(0);
                in.nextLine();
            } while (token != 'q');
        }
        
        
    }
}
