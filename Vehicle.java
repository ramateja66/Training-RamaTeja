class Bike
{
static int total_wheels;
int mileage;
int total_gears;
int number_of_persons;
float top_speed;
float bike_weight;
float price;
char availability;
char fuel_type;
String company_name;
String best_colour;
}
class Car
{
static int total_wheels;
int total_gears;
int number_of_persons;
float car_weight;
float top_speed;
float price;
char fuel_type;
char availability;
String best_colour;
String company_name;

}
public class Vehicle
{
public static void main(String args[])
{
/* Creating a Bike object */ 
Bike pulsar=new Bike();
Bike.total_wheels=2;
pulsar.mileage=40;
pulsar.total_gears=4;
pulsar.number_of_persons=2;
pulsar.top_speed=105.7f;
pulsar.bike_weight=175.6f;
pulsar.price=17659.5f;
pulsar.availability='Y';
pulsar.fuel_type='P';
pulsar.company_name="BAJAJ";
pulsar.best_colour="Red";

/* Creating a Car object */
Car swift=new Car();
Car.total_wheels=4;
swift.total_gears=6;
swift.number_of_persons=5;
swift.car_weight=400.5f;
swift.top_speed=156.7f;
swift.price=751236.5f;
swift.fuel_type='D';
swift.availability='N';
swift.best_colour="Purple";
swift.company_name="Maruti Suzuki";

System.out.println("===============Bike Details==============");
System.out.println("Total Wheels :" + Bike.total_wheels);
System.out.println("Mileage(kms) :" + pulsar.mileage);
System.out.println("Total gears :" + pulsar.total_gears);
System.out.println("Capacity of persons :" +  pulsar.number_of_persons);
System.out.println("Top Speed(Km/hr) :" + pulsar.top_speed);
System.out.println("Bike Weight(kgs) :" + pulsar.bike_weight);
System.out.println("Price(Rs) :" + pulsar.price);
System.out.println("Availability(Y/N) :" + pulsar.availability);
System.out.println("Fuel Type :" + pulsar.fuel_type);
System.out.println("Best Colour :" + pulsar.best_colour);
System.out.println("Bike Company name :" + pulsar.company_name);

System.out.println("===============Car Details==============");
System.out.println("Total Wheels :" + Car.total_wheels);
System.out.println("Total gears :" + swift.total_gears);
System.out.println("Capacity of persons :" + swift.number_of_persons);
System.out.println("Car Weight(kgs) :" + swift.car_weight);
System.out.println("Top Speed(Km/hr) :" + swift.top_speed);
System.out.println("Price(Rs) :" + swift.price);
System.out.println("Fuel Type :" + swift.fuel_type);
System.out.println("Availability(Y/N) :" + swift.availability);
System.out.println("Best Colour :" + swift.best_colour);
System.out.println("Bike Company name :" + swift.company_name);
}
}