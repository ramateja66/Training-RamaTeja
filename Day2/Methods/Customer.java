class Restaurant
{
void menu()
{
System.out.println("1.Dosa 2.Idly 3.Wada 4.Poori " );
}
void takeOrder(String order)
{
System.out.println("Order given is " + order);
}
String serveFood()
{
return "Dosa";
}
int giveBill()
{
return 421;
}
String payBill(int amount)
{
System.out.println("Amount received is " + amount);
return "paid";
}
}
public class Customer
{
public static void main(String args[])
{
/* Creating object for Restaurant */ 
Restaurant krupa=new Restaurant();
/* Calling Methods */ 
krupa.menu();
krupa.takeOrder("Poori");
System.out.println("Food served is : " + krupa.serveFood());
System.out.println("Bill is : " + krupa.giveBill());
System.out.println("Status : " + krupa.payBill(10));
}
}



