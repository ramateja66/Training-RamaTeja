class Information
{
int legs;
int tail;
int price;
float weight;
float height;
String breed_name;
String dog_name;
String dog_colour;
String dog_owner;
Information()
{
legs=4;
tail=1;
price=15400;
weight=25.6f;
height=5.4f;
breed_name="Shihtzu";
dog_name="Bullet";
dog_colour="cream";
dog_owner="Krishna";
}
void dogDetails()
{
System.out.println("Dog name-"+dog_name+";"+"Dog colour-"+dog_colour+";"+"Owner Name-"+dog_owner+";"+"Breed Name-" +breed_name+";"+"Height-"+height+";"+"Weight-"+weight+";"+"Legs"+legs+";"+"Tail-"+tail);
}
}
public class Dog
{
public static void main(String args[])
{
Information pug=new Information();
pug.dogDetails();
}
}
 



