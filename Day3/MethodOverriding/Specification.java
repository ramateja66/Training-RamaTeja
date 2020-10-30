class Mobile
{
void ramSize()
{
System.out.println("No RAM Size");
}
void camera()
{
System.out.println("No Camera");
}
void cost()
{
System.out.println("No Cost");
}
void displaySize()
{
System.out.println("No display Size");
}

}
class Iphone extends Mobile
{
void ramSize()
{
System.out.println(" RAM Size 4 GB" );
}
void camera()
{
System.out.println(" Camera is 5 MP");
}
void cost()
{
System.out.println("Cost is Rs.22000");
}
void displaySize()
{
System.out.println("Display Size is 5.4cms");
}
}

class Oneplus extends Mobile
{
void ramSize()
{
System.out.println(" RAM Size 6 GB" );
}
void camera()
{
System.out.println(" Camera is 15 MP");
}
void cost()
{
System.out.println("Cost is Rs.450000");
}
void displaySize()
{
System.out.println("Display Size is 6.5cms");
}
}
public class Specification
{
public static void main(String args[])
{
Mobile digital=new Mobile();
System.out.println("------Mobile Details------");
digital.ramSize();
digital.camera();
digital.camera();
digital.cost();
digital=new Iphone();
System.out.println("-----Mobile Details of Iphone-----");
digital.ramSize();
digital.camera();
digital.camera();
digital.cost();
digital=new Oneplus();
System.out.println("-----Mobile Details of OnePlus-----");
digital.ramSize();
digital.camera();
digital.camera();
digital.cost();
}
}
