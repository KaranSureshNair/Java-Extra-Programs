package CIE;
import java.util.Scanner;

public class Internal extends Student{

protected int[]ciemarks=new int[5];
public void InputCIEMarks(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your CIE marks for the 5 subjects here:");
    for(int i=0;i<5;i++){
        System.out.print("Subject"+(i+1)+":");
        ciemarks[i]=sc.nextInt();
    }


    System.out.println("CIE marks are as follows:");
    for(int i=0;i<5;i++){
        System.out.print("\nSubject"+(i+1)+":"+ciemarks[i]);
        
    }

}


}
