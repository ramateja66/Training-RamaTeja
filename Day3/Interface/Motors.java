interface Vehicles
{
void cost();
void mileage();
}

abstract class Car implements Vehicles
{
Car()
{
System.out.println("----------Car Details ---------- ");
}
void seatingCapacity()
{
System.out.println("Seating Capacity of a car is 4");
}
void vipers()
{
System.out.println("Number of Vipers are 2");
}
}

abstract class Bike implements Vehicles
{
Bike()
{
System.out.println("----------Bike Details ----------");
}
void seatingCapacity()
{
System.out.println("Seating Capacity of a bike is 2");
}
void stand()
{
System.out.println("Ther is only one Stand");
}
}

class Audi extends Car
{
public void cost()
{
System.out.println("Cost of a car is 45 LAkhs");
}
public void mileage()
{
System.out.println("Mileage is 10ksm");
}
}

class Karishma extends Bike
{
public void cost()
{
System.out.println("Cost of a bike is 25000");
}
public void mileage()
{
System.out.println("Mileage of bike is 35kms");
}
}

public class Motors 
{
public static void main(String args[])
{
/* Creating an object */
Car hexa=new Audi();
hexa.cost();
hexa.mileage();
hexa.vipers();
hexa.seatingCapacity();
/* Creating an object */
Bike hero=new Karishma();
hero.cost();
hero.mileage();
hero.stand();
hero.seatingCapacity();
}
}
