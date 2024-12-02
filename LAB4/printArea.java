import java.util.Scanner;

abstract class Shape{
double a,b,result;

abstract void printArea();
}

class Rectangle extends Shape{
void printArea(){
System.out.println("Enter l and b of rectangle:");
Scanner s=new Scanner(System.in);
a=s.nextDouble();
b=s.nextDouble();
result=a*b;
System.out.println(result+" sq units");
}
}
class Triangle extends Shape{
void printArea(){
System.out.println("Enter b and h of triangle:");
Scanner s=new Scanner(System.in);
a=s.nextDouble();
b=s.nextDouble();
result=a*b/2;
System.out.println(result+" sq units");
}
}
class Circle extends Shape{
void printArea(){
System.out.println("Enter radius of circle:");
Scanner s=new Scanner(System.in);
a=s.nextDouble();
result=3.142*a*a;
System.out.println(result+" sq units");
}
}

class printArea{
public static void main(String args[]){
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
r.printArea();
t.printArea();
c.printArea();
}
}