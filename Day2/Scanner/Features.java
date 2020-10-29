import java.util.Scanner;
class Mobile
{
int storage;
int ram;
int price;
float display;
float weight;
float width;
String processor;
String battery_type;
String company_name;
String model_name;
}

public class Features
{
public static void main(String args[])
{
/* Creating an object for Scanner class */
Scanner sc=new Scanner(System.in);
/* Creating an object for Mobile class */
Mobile nokia=new Mobile();
/*  Assigning values through user */ 
System.out.println("Enter storage details ");
nokia.storage=sc.nextInt();
System.out.println("Enter RAM details" );
nokia.ram=sc.nextInt();
System.out.println("Enter price " );
nokia.price=sc.nextInt();
System.out.println("Enter Display");
nokia.display=sc.nextFloat();
System.out.println("Enter Weight");
nokia.weight=sc.nextFloat();
System.out.println("Enter Width ");
nokia.width=sc.nextFloat();
System.out.println("Enter Processor Name");
nokia.processor=sc.next();
System.out.println("Enter Battery type");
nokia.battery_type=sc.next();
System.out.println("Enter Company Name");
nokia.company_name=sc.next();
System.out.println("Enter Model Name");
nokia.model_name=sc.next();
System.out.println("---------------------The Details Are----------------------");
System.out.println("Company Name : " + nokia.company_name);
System.out.println("Model Name : " + nokia.model_name );
System.out.println("Processor Name : " + nokia.processor);
System.out.println("Battery Type : " + nokia.battery_type);
System.out.println("RAM size : " + nokia.ram);
System.out.println("Display : " + nokia.display);
System.out.println("Weight : " + nokia.weight);
System.out.println("Width : " + nokia.width);
System.out.println("Storage Details : " + nokia.storage);
System.out.println("Price  : " + nokia.price);
}
}


