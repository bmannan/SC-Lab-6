package javaapplication5;
import java.util.Scanner;


public class JavaApplication5 {
    
    public static void main(String[] args) {
       String[][] studentData= new String[7][3];
       String[] names = new String[3];
       String[] regs = new String[3];
       Double[] cgpas = new Double[3];
       Scanner readerName = new Scanner(System.in);
       Scanner readerReg = new Scanner(System.in);
       Scanner readerCGPA = new Scanner(System.in);
       
       studentData[0][0] = "StudentName";
       studentData[0][1] = "RegistrationNumber";
       studentData[0][2] = "CGPA";
       
       for(int z=1; z<7; z++){
       System.out.println("Enter Student Name: ");
       String name = readerName.nextLine();
       studentData[z][0] = name;
       
       System.out.println("Enter Registration Number: ");
       String reg = readerReg.nextLine();
       for(int k=1; k<7; k++){
           if(reg.equals(studentData[k][1])){
               System.out.println("Duplicate, please enter again: ");
               studentData[z][1] = readerReg.nextLine();
           }else{
                studentData[z][1] = reg;
                break;
           }
       }
       
       System.out.println("Enter CGPA");
       Double cgpa = readerCGPA.nextDouble();
       String temp = Double.toString(cgpa);
       if(cgpa.equals("") || cgpa < 0 || cgpa > 4 || temp.length() > 4){
           System.out.println("Invalide, please enter again: ");
           Double cgpa1 = readerCGPA.nextDouble();
           studentData[z][2] = Double.toString(cgpa1);
       }else{
            studentData[z][2] = Double.toString(cgpa);
            }
        
       /*System.out.println(name);
       System.out.println(reg);
       System.out.println(cgpa);
       */
       }
       
       /*Print the table*/
       System.out.print("\n");
       System.out.print("\n");
       System.out.print("\n");
       for(int i=0; i<7 ; i++){
           for(int j=0; j<3; j++){
              System.out.print(studentData[i][j]); 
              System.out.print("                                                                    ");
           }
           System.out.print("\n");
       }
       
       /*Average, min and max calculated*/
       Double total= 0.00;
       Double min = 4.10;
       Double max = 0.00;
       
       for(int o=1;o<7;o++){
           total = total + Double.parseDouble(studentData[o][2]);
           if(Double.parseDouble(studentData[o][2]) > max){
               max=Double.parseDouble(studentData[o][2]);
           }
           if(Double.parseDouble(studentData[o][2]) < min){
               min=Double.parseDouble(studentData[o][2]);
           }
       }
       
       /*Average*/
       double average = total/6;
       System.out.print("Average :");
       System.out.print(average);
       System.out.println("");
       
       /*Min*/
       System.out.print("Min :");
       System.out.print(min);
       System.out.println("");
       
       /*Max*/
       System.out.print("Max :");
       System.out.print(max);
       System.out.println("");
       
       /*Students below average CGPA*/
       System.out.println("Students below average: ");
       for(int y=1; y<7; y++){
           if(Double.parseDouble(studentData[y][2]) < average){
               System.out.print(studentData[y][0]);
               System.out.print("  ");
           }
       }
       
       String nameOfStudent = "";
       String regNum = "";
       Scanner reader = new Scanner(System.in);
       System.out.println("Enter Name: ");
       nameOfStudent = reader.nextLine();
       System.out.println("Enter Reg number: ");
       regNum = reader.nextLine();
       
       for(int e=1; e<7; e++){
           if(nameOfStudent.equals(studentData[e][0]) || regNum.equals(studentData[e][1])){
               System.out.println("Available!");
               System.out.print("Name :");
               System.out.println(studentData[e][0]);
               System.out.print("Registration Number :");
               System.out.println(studentData[e][1]);
           }else{
               System.out.println("");
           }
       }
       /*
       for (int i = 1; i < 7-1; i++)
           for (int j = 1; j < 7-i-1; j++)
               if (Double.parseDouble(studentData[j][2]) > Double.parseDouble(studentData[j+1][2]))
               {
                    // swap temp and arr[i]
                   String temp = studentData[j][2];
                   studentData[j][2] = studentData[j+1][2];
                   studentData[j+1][2] = temp;
               }
       */
    }
    
    
}
