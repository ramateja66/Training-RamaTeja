abstract class Animals
{
abstract void animalSound();
abstract void totalLegs();
void breath()
{
System.out.println("Breathes oxygen");
}
}
class Dog extends Animals
{
void animalSound()
{
System.out.println("Dog makes Bow Bow  ");
}
void totalLegs()
{
System.out.println("Total legs are 4");
}
}

class Pigeon extends Animals
{
void animalSound()
{
System.out.println("Pigeon makes pickow pickow ");
}
void totalLegs()
{
System.out.println("Total legs are 2");
}
}

public class Features   
{
public static void main(String args[])
{
Animals lab=new Dog();
System.out.println("-----Dog Details----");
lab.animalSound();
lab.totalLegs();
lab.breath();
lab=new Pigeon();
System.out.println("--------Pigeon Details-------");
lab.animalSound();
lab.totalLegs();
lab.breath();
}
}


