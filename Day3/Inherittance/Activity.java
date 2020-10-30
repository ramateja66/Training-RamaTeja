class Man
{
void walk()
{
System.out.println("Man can walk ");
} 
void breaths()
{
System.out.println("Man Breaths oxygen");
}
}
class Shiva extends Man
{
void height()
{
System.out.println("Man is so tall");
}
void weight()
{
System.out.println("Man is 45kgs");
}
}
public class Activity
{
public static void main(String args[])
{
Shiva siva=new Shiva();
siva.walk();
siva.breaths();
siva.height();
siva.weight();
}
} 