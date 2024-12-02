import java.util.Scanner;

public class studentsgpa {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of students: ");
int numStudents = sc.nextInt();
sc.nextLine();

String[] names = new String[numStudents];
String[] usns = new String[numStudents];
int[][] creditsArray = new int[numStudents][];
int[][] marksArray = new int[numStudents][];
double[] sgpas = new double[numStudents];

       
for (int s = 0; s < numStudents; s++) {
System.out.println("Enter details for student " + (s + 1) + ":");

           
System.out.print("Enter your name: ");
names[s] = sc.nextLine();
System.out.print("Enter your USN: ");
usns[s] = sc.nextLine();


System.out.print("Enter the number of subjects: ");
int numSubjects = sc.nextInt();


int[] credits = new int[numSubjects];
System.out.println("Enter the credits for each subject:");
for (int i = 0; i < numSubjects; i++) {
credits[i] = sc.nextInt();
}
creditsArray[s] = credits; 

int[] marks = new int[numSubjects];
System.out.println("Enter the marks for each subject out of 100:");
for (int i = 0; i < numSubjects; i++) {
marks[i] = sc.nextInt();
}
marksArray[s] = marks; 

         
int[] gradePoints = new int[numSubjects];
int[] resultArray = new int[numSubjects];
for (int i = 0; i < numSubjects; i++) {
gradePoints[i] = (marks[i] / 10) + 1; 
resultArray[i] = credits[i] * gradePoints[i]; 
}

int totalCredits = sum(credits);
int totalResult = sum(resultArray);
if (totalCredits > 0) {
sgpas[s] = (double) totalResult / totalCredits;
} else {
sgpas[s] = 0.0;
}
}

System.out.println("\n--- Results ---");
for (int s = 0; s < numStudents; s++) {
System.out.println("Student " + (s + 1) + " (" + names[s] + ", " + usns[s] + "):");
System.out.print("Credits: ");
for (int credit : creditsArray[s]) {
System.out.print(credit + " ");
}
System.out.println();
System.out.print("Marks: ");
for (int mark : marksArray[s]) {
System.out.print(mark + " ");
}
System.out.println();
System.out.println("SGPA: " + sgpas[s]);
System.out.println();
}}
static int sum(int[] array) {
int sum = 0;
for (int value : array) {
sum += value;
}
return sum;
}
}
