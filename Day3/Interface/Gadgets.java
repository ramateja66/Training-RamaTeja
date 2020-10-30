interface Electronics
{
void displaySize();
void cost();
void ramSize();
}

abstract class Laptops implements Electronics
{
Laptops()
{
System.out.println("Laptop Details"); 
}
void batteryType()
{
System.out.println("For Laptops battery type is Rechargable");
}
}

abstract class Mobiles implements Electronics
{
Mobiles()
{
System.out.println("Mobile Details ");
}
void chargerAvailability()
{
System.out.println("charger will be available with mobile phone");
}
void simSupport()
{
System.out.println("Sim supported");
}
}

class Lenovo extends Laptops
{
public void displaySize()
{
System.out.println("Display Size is 20.5 inches");
}
public void cost()
{
System.out.println("Cost is 35000");
}
public void ramSize()
{
System.out.println("Ram size is 4gb");
}
}
class Oppo extends Mobiles
{
public void displaySize()
{
System.out.println("Size of a Mobile phone is 5.6 inches");
}
public void ramSize()
{
System.out.println("Ram Size is 4Gb "); 
}
public void cost()
{
System.out.println("Cost of a Mobile is 140000");
}

}
public class Gadgets
{
public static void main(String args[])
{
Laptops ideapad=new Lenovo();
ideapad.displaySize();
ideapad.cost();
ideapad.ramSize();
ideapad.batteryType();
System.out.println("--------------------------------------------");
Mobiles reno=new Oppo();
reno.displaySize();
reno.cost();
reno.ramSize();
reno.chargerAvailability();
reno.simSupport();
}
}

