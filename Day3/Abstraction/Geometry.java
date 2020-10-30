abstract class Quadrilateral
{
abstract void angle();
abstract void name();
void totalSides()
{
System.out.println("Total sides are 4");
}
}
class Square extends Quadrilateral
{
void angle()
{
System.out.println("Angle is 90 degrees");
}
void name()
{
System.out.println("Name of quadrilateral is Square");
}
}
class Parallelogram extends Quadrilateral
{
void angle()
{
System.out.println("Angle is 180 degrees");
}
void name()
{
System.out.println("Name of quadrilateral is parallelogram");
}
}
class Trapezium extends Quadrilateral
{
void angle()
{
System.out.println("Angle is 360 degrees");
}
void name()
{
System.out.println("Name of quadrilateral is Trapezium");
}
}

public class Geometry
{
public static void main(String args[])
{
Quadrilateral diagram=new Square();
System.out.println("---------Square Details----------");
diagram.angle();
diagram.name();
diagram.totalSides();
diagram=new Parallelogram();
System.out.println("---------Parallelogram Details----------");
diagram.angle();
diagram.name();
diagram.totalSides();
diagram=new Trapezium();
System.out.println("---------Trapezium Details----------");
diagram.angle();
diagram.name();
diagram.totalSides();

}
}

