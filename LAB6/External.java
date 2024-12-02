package SEE;
import java.util.Scanner;
import CIE.Internal;
public class External extends Internal{
    int [] seemarks=new int[5];
    int [] finalmarks=new int[5];

    public void inputSEEMarks(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter the 5 SEE Marks here:");
        for(int i=0;i<5;i++){
            System.out.print("\nSubject"+(i+1)+":");
            seemarks[i]=sc.nextInt();
        }

    }
    public void Calculatefinalmarks(){
        for(int i=0;i<5;i++){
            finalmarks[i]=(this.ciemarks[i]+this.seemarks[i])/2;
        }
    }
    public void Displayfinalmarks(){
        DisplayStudent();
        System.out.println("\nThe final marks of the 5 subjects are:");
        for(int i=0;i<5;i++){
            System.out.print("\nSubject"+(i+1)+":"+finalmarks[i]);
        }
    }
}

