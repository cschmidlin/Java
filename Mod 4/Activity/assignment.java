import java.io.*;
import java.util.Scanner;

public class assignment{
    public static void main(String[] args) throws FileNotFoundException, IOException{
        System.out.println("Starting the file");

        Scanner inFile = new Scanner(new File("mod04_dataset.csv"));
        inFile.useDelimiter(",");
        /*String header1 = inFile.next();
        String header2 = inFile.next();
        String header3 = inFile.next();
        String header4 = inFile.next();
        System.out.println(header1 + ", " + header2 + ", " + header3 + ", " + header4 + ",");*/
        
        System.out.println("middle");
        FileWriter fw = new FileWriter("text.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        while(inFile.hasNext()){
            String[] data = new String[4];
            for( int i = 0; i < 4; i++){
                data[i] = inFile.next();
            }
            for(int j = 0; j < data.length; j++){
                pw.println(data[j]);
            }
                //pw.println(data[i]);
                //System.out.println(data[i]);

            /*int year = inFile.nextInt();
            int census = Integer.parseInt(inFile.next());
            String type = inFile.next();
            int total = Integer.parseInt(inFile.next());
            System.out.println(year + ", " + census + ", " + type + ", " + total + "\n");*/
        }
        
        inFile.close();

        System.out.println("end");
    }
}