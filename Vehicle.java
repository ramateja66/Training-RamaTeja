class Bike
{
static int total_wheels;
float bike_weight;
String company_name;
char fuel_type;
}
class Car
{
String car_name;
float car_weight;
int total_gears;
char fuel_type;
static int total_wheels;
}
public class Vehicle
{
public static void main(String args[])
{
/* Creating a Bike object */ 
Bike pulsar=new Bike();
pulsar.bike_weight=158.45f;
pulsar.company_name="Bajaj";
pulsar.fuel_type='P';
Bike.total_wheels=2;

/* Creating a Car object */
Car swift=new Car();
Car.total_wheels=4;
swift.car_name="Swift Dzire";
swift.car_weight=250.6f;
swift.total_gears=6;
swift.fuel_type='D';

System.out.println("===============Bike Details==============");
System.out.println("Bike Company name " + pulsar.company_name);
System.out.println("Bike Weight " + pulsar.bike_weight);
System.out.println("Fuel Type " + pulsar.fuel_type);
System.out.println("Total Wheels " + Bike.total_wheels);
 
System.out.println("==============Car Details ================");
System.out.println("Car Company name " + swift.car_name);
System.out.println("Car weight " + swift.car_weight);
System.out.println("Total Gears " + swift.total_gears);
System.out.println("Fuel Type " + swift.fuel_type);
System.out.println("Total Wheels " + Car.total_wheels);
}
}