import java.util.Scanner;
class Square
{
int number;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
number=sc.nextInt();
}
void sqr()
{
int square=number*number;
System.out.println("Square of number is "+square);
}
}
class Addition extends Square
{
int number2;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
number2=sc.nextInt();
}
void addition()
{
int result=number+number2;
System.out.println("Addition of two number is "+ result);
}
}
public class Calculation 
{
public static void main(String args[])
{
Addition sum=new Addition();
sum.input();
sum.sqr();
/* Calling Sub class methods */
sum.accept();
sum.addition();
}
}
