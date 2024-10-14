import java.util.Scanner;
class Book{
private String name;
private String author;
private int price;
private int numPages;

Book(String name, String author, int price, int numPages){
this.name = name;
this.author = author;
this.price = price;
this.numPages = numPages;}

public String toString(){
String name ,author ,price ,numPages ;
name="Book name: " + this.name + "\n";
author="Author name:" + this.author+"\n";
price = "Price: " +  this.price + "\n";
numPages = "Number of pages: " + this.numPages + "\n";
return name + author + price + numPages;
}}


public class Books{
public static void main(String args[]){
String name, author;
int price, numPages;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of books:");
int n =sc.nextInt();
Book [] books= new Book[n];


for(int i=0;i<n;i++){
System.out.println("enter the name of the "+(i+1)+" Book:");
name =sc.next();
System.out.println("enter the author of the "+(i+1)+" book:");
author= sc.next();
System.out.println("enter the price of the "+(i+1)+" book:");
price= sc.nextInt();
System.out.println("enter the number of pages of the "+(i+1)+" Book:");

numPages = sc.nextInt();

System.out.println("Result");
books[i]= new Book(name, author, price, numPages);
System.out.println(books[i]);
}
}
}


