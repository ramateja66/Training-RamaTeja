abstract class Car
{
abstract void topSpeed();
abstract void bestColor();
void start()
{
System.out.println("Starts with a key");
}
}

class Benz extends Car
{
void topSpeed()
{
System.out.println("Top speed is 156.4 km/hr");
}
void bestColor()
{
System.out.println("Best Color is Red");
}
}

class Ferrari extends Car
{
void topSpeed()
{
System.out.println("Top Speed of a Car is 200 km/hr");
}
void bestColor()
{
System.out.println("BEst Color is Violet");
}
}
public class Model
{
public static void main(String args[])
{
Car xylo=new Benz();
xylo.topSpeed();
xylo.bestColor();
xylo.start();
xylo=new Ferrari();
xylo.topSpeed();
xylo.bestColor();
xylo.start();
}}
