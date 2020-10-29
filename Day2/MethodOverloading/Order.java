class Restaurant
{
void takeOrder(String order)
{
System.out.println("Order given is "+ order);
}
void takeOrder(String order1,String order2)
{
System.out.println("Orders are "+order1+ "&" + order2);
}
void takeOrder(String order1,String order2,String order3)
{
System.out.println("Order are " +order1+" & " + order2 + " & " + order3);
}
}
public class Order
{
public static void main(String args[])
{
Restaurant nivas=new Restaurant();
nivas.takeOrder("Idly");
nivas.takeOrder("Idly","Poori","Dosa");
nivas.takeOrder("Idly","dosa");
}
}
