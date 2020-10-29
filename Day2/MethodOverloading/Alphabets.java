class Letters
{
void numberOfLetters(String alphabet)
{
System.out.println("Number of letter are  1");
}
void numberOfLetters(String alphabet1,String alphabet2)
{
System.out.println("Number of letter are  2");
}
void numberOfLetters(String alphabet,String alphabet2,String alphabet3)
{
System.out.println("Number of letter are  3");
}
void numberOfLetters(String alphabet,String alphabet2,String alphabet3,String alphabet4)
{
System.out.println("Number of letter are  4");
}
void numberOfLetters(String alphabet,int number)
{
System.out.println("Number of letter are  1 and Number is 1");
}
void numberOfLetters(String alphabet,int number1,int number2)
{
System.out.println("Number of letter are  1 and Numbers are 2");
}
}
public class Alphabets
{
public static void main(String args[])
{
Letters total=new Letters();
total.numberOfLetters("king");
total.numberOfLetters("king","queen");
total.numberOfLetters("King ","queen","Joker");
total.numberOfLetters("king","Queen","Joker","army");
total.numberOfLetters("king",1);
total.numberOfLetters("queen",20,30);
}
}


