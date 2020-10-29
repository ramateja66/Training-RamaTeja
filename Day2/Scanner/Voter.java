import java.util.Scanner;
class Details
{
int id_number;
int date_of_birth;
float height;
float income;
long mobile_number;
long pin_code;
String first_name;
String last_name;
String locality;
String nationality;
}
public class Voter
{
public static void main(String args[])
{
/* Creating an object for Details Class */
Details krish=new Details();
/* Creating an object for scanner Class */
Scanner sc=new Scanner(System.in);
/* Assigning values */
System.out.println("Enter id number");
krish.id_number=sc.nextInt();
System.out.println("Enter Date of Birth");
krish.date_of_birth=sc.nextInt();
System.out.println("Enter height");
krish.height=sc.nextFloat();
System.out.println("Enter income");
krish.income=sc.nextFloat();
System.out.println("Enter Mobile Number");
krish.mobile_number=sc.nextLong();
System.out.println("Enter Pin Code");
krish.pin_code=sc.nextLong();
System.out.println("Enter First Name");
krish.first_name=sc.next();
System.out.println("Enter Last Name");
krish.last_name=sc.next();
System.out.println("Enter Locality");
krish.locality=sc.next();
System.out.println("Enter Nationality");
krish.nationality=sc.next();
System.out.println("********************The Details Are ********************");
System.out.println("First Name : " + krish.first_name);
System.out.println("Last Name : " + krish.last_name);
System.out.println("Id Number : " + krish.id_number);
System.out.println("Date of Birth : " + krish.date_of_birth);
System.out.println("Height : " + krish.height);
System.out.println("Income : " + krish.income);
System.out.println("Mobile Number : " + krish.mobile_number);
System.out.println("Locality : " + krish.locality);
System.out.println("Pin Code : " + krish.pin_code);
System.out.println("Nationality : " + krish.nationality);
}
}
