import SEE.External;
import java.util.Scanner;


public class main {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of students:");
    int n = sc.nextInt();
    External[]student = new External[n];
    for(int i=0; i<n;i++){
        System.out.println("\nEnter details for Students here"+(i+1)+":");
        student[i]= new External();
        student[i].InputStudent();
        student[i].InputCIEMarks();
        student[i].inputSEEMarks();
        student[i].Calculatefinalmarks();}
    System.out.println("\nFinalmarks of students:");
    for(int i=0;i<n;i++){
            System.out.println("\nStudent"+(i+1)+":");
            student[i].Displayfinalmarks();
        }
        sc.close();
    }
    
    
 
}
    

