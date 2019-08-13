/**

 ** Figure out Insurance rates based on BMI of individuals*/

 

import java.util.*;

import java.io.*;  

public class BodyMassIndex{

   

    public static void BMI(int weight, int height, String patientName, String patientbirthDate)throws IOException{

        int BMIamount = (703 * weight) / (height^2);

 

         FileWriter fileWriter = new FileWriter("bmi.txt");

         PrintWriter printWriter = new PrintWriter(fileWriter);

          if(BMIamount < 18.5) {

             printWriter.print(patientName + patientbirthDate + "Your Insurance Catagory is Low due to your BMI being underweight.");

          }    

         else if(BMIamount < 24.9){

             printWriter.print(patientName + patientbirthDate + "Your Insurance Catagory is Low due to your BMI being Normal.");

          }

         else if(BMIamount < 29.9){

             printWriter.print(patientName + patientbirthDate + "Your InsuranceCatagory is High due to your BMI being overweight.");

          }

        else{

            printWriter.print(patientName + patientbirthDate + "Your InsuranceCatagory is the Highest due to your BMI being obese.");

         } 

           printWriter.close();

       }

 

 

    public static void main(String[] args){

   

        int BMI;

        int weight;

        int height;

        String patientName;

        String patientbirthDate;

        int a = 1;

        Scanner input = new Scanner(System.in);

       

        do{

        try{

            System.out.println("Enter your name please: ");

            patientName = input.nextLine();

           

            System.out.println("Enter your birthdate mm/dd/yyyy: ");

            patientbirthDate = input.nextLine();

       

            System.out.println("This application is meant to calculate BMI");

            System.out.println("Enter your height to the nearest inch please: ");

            height = input.nextInt();
            System.out.println("Enter your weight to the nearest pound please: ");
            weight= input.nextInt();
            BMI(weight,height,patientName,patientbirthDate);
            a=2;
            System.out.println("Enter q to finish this session");
            Scanner sc=new Scanner(System.in);
            String ch=sc.nextLine();
        }
        catch(Exception e){

            System.out.println("Information not entered correctly, renter");
        }finally{

            System.out.println("End Calculation");

        }
    } while(ch!='q'|| ch!='Q');

  }

}