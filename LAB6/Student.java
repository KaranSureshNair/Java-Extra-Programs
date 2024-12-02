package CIE;
import java.util.Scanner;

public class Student {
    String USN;
    String Name;
    int sem;

    public void InputStudent(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your usn here:");
        USN=sc.nextLine();
        System.out.println("Enter your name here:");
        Name=sc.nextLine();
        System.out.println("Enter your semester here:");
        sem=sc.nextInt();
    }

    public void DisplayStudent(){
        System.out.println("Name:"+Name);
        System.out.println("USN:"+USN);
        System.out.println("Semester:" +sem);

    }
   
}
