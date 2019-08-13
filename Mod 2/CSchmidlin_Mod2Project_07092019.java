import java.util.Scanner;
public class test {
public static void main(String[] args) {
//Creating the scanner for getting user's info
Scanner in = new Scanner(System.in);


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
int BMI = 703 * weight / (height*height);


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
}
}
 
