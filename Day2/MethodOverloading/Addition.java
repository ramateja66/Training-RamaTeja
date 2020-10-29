class Calculator
{
void addNumber(int number)
{
System.out.println("Addition of number is " + number);
}
void addNumber(int number1,int number2)
{
System.out.println("Addition of number is " + (number1+number2));
}
void addNumber(int number1,int number2,int number3)
{
System.out.println("Addition of number is " + (number1+number2+number3));
}
void addNumber(int number1,int number2,int number3,int number4)
{
System.out.println("Addition of number is " + (number1+number2+number3+number4));
}
}
public class Addition
{
public static void main(String args[])
{
Calculator add=new Calculator();
add.addNumber(10);
add.addNumber(10,20);
add.addNumber(10,30,40);
add.addNumber(10,50,60,70);

}
}
