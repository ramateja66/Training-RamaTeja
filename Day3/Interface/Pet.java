interface Animal
{
void lifeSpan();
void colour();
void weight();
}

abstract class Dog implements Animal
{
Dog()
{
System.out.println("-----Dog Details-----");
}
void numberOfEars()
{
System.out.println("Dog has 2 ears ");
}
void sound()
{
System.out.println("Dog makes Bow Bow sound");
}
}


abstract class Bird implements Animal
{
Bird()
{
System.out.println("-----Bird Details------");
}
void numberofLegs()
{
System.out.println("It has 2 Legs");
}
void doesItFlies()
{
System.out.println("Flies in Air");
}
}


class Shitzu extends Dog
{
public void lifeSpan()
{
System.out.println("LifeSpan is 15 years");
}
public void colour()
{
System.out.println("Color is Golden");
}
public void weight()
{
System.out.println("Weight is 15 kgs");
}
}

class Pigeon extends Bird
{
public void lifeSpan()
{
System.out.println("Life Span is 2 years");
} 
public void colour()
{
System.out.println("Color is Black");
}
public void weight()
{
System.out.println("2 kgs");
}
}

public class Pet
{
public static void main(String args[])
{
Dog bullet=new Shitzu();
bullet.lifeSpan();
bullet.colour();
bullet.weight();
bullet.numberOfEars();
bullet.sound();
/* Assigning a pigeon object to bullet */
Bird flies=new Pigeon();
flies.lifeSpan();
flies.colour();
flies.weight();
flies.numberofLegs();
flies.doesItFlies();
}
}

