class Car
{
void cost()
{
System.out.println("No cost");
}
void mileage()
{
System.out.println("No mileage");
}
}
class Audi extends Car
{
void cost()
{
System.out.println("Cost is 45 lakhs");
}
void mileage()
{
System.out.println("Milegae is 10 kms");
}
}
class Benz extends Car
{
void cost()
{
System.out.println("Cost is 32 lakhs");
}
void mileage()
{
System.out.println("Milegae is 20 kms");
}
}

public class Vehicle
{
public static void main(String args[])
{
Car ritz=new Audi();
ritz.cost();
ritz.mileage();
ritz=new Benz();
ritz.cost();
ritz.mileage();

}
}
