import java.util.Scanner;
public class Student1 {
public static void main(String[] args) {

String name;  
String usn; 

Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
name = sc.nextLine();
System.out.print("Enter your USN: ");
usn = sc.nextLine();

System.out.print("Enter the number of subjects: ");
int arr_credits = 0;
if (sc.hasNextInt()) {
arr_credits = sc.nextInt();
}
int[] credits = new int[arr_credits]; 
System.out.println("Enter the credits of each subject:");
for (int i = 0; i < arr_credits; i++) {
if (sc.hasNextInt()) {
credits[i] = sc.nextInt();
}
}
        
System.out.println("The credits of all the subjects are as follows:");
for (int i = 0; i < arr_credits; i++) {
System.out.print(credits[i] + " ");
}
System.out.println(); 

System.out.print("Enter the number of subjects (for marks): ");
int arr_marks = 0;
if (sc.hasNextInt()) {
arr_marks = sc.nextInt();
}
int[] marks = new int[arr_marks];
System.out.println("Enter the marks of each subject out of hundred:");
for (int i = 0; i < arr_marks; i++) {
if (sc.hasNextInt()) {
marks[i] = sc.nextInt();
}
}

System.out.println("The marks of each subject are as follows:");
for (int i = 0; i < arr_marks; i++) {
System.out.print(marks[i] + " ");
}
System.out.println();

int[] gradePoints = new int[arr_marks];
System.out.println("The grade points for each subject are as follows:");
for (int i = 0; i < arr_marks; i++) {
gradePoints[i] = ((marks[i] / 10)+1); 
System.out.print(gradePoints[i] + " ");
}
System.out.println(); 

int[] resultArray = new int[arr_marks]; 
for (int i = 0; i < arr_marks; i++) {
resultArray[i] = credits[i] * gradePoints[i]; 
}

System.out.print("Result Array: ");
for (int value : resultArray) {
System.out.print(value + " ");
}
System.out.println(); 

int total = sum(resultArray); 
double SGPA = (double) total / sum(credits); 
System.out.println("The SGPA is: " + SGPA); 
}

static int sum(int[] resultArray) {
int sum = 0;
for (int value : resultArray) {
sum += value;
}
return sum;
}
}