class Movie 
{
void theatreNames()
{
System.out.println("1.Asian 2.Radhika 3.PVR 4.Murali 5.Sree Ramana ");
}
void movieNames()
{
System.out.println("1.Terminator 2.Thanos 3.Blue Fish 4.Anabelle ");
}
void selectedTheatre(String theatre)
{
System.out.println("Selected theatre is " + theatre);
}
void selectedMovie(String movie)
{
System.out.println("Selected movie is " + movie);
}
int totalPersons()
{
return 2;
}
int seatNumber()
{
return 45;
}
int paymentMode(String mode)
{
System.out.println("Payment Mode is " + mode);
return 150;
}
}
public class Person
{
public static void main(String args[])
{
/* Creating an object for Movie */ 
Movie thanos=new Movie();
/* Calling Methods */ 
thanos.theatreNames();
thanos.movieNames();
thanos.selectedTheatre("Radhika");
thanos.selectedMovie("Anabelle");
System.out.println("Number of Persons " + thanos.totalPersons());
System.out.println("Selected Seat Number " + thanos.seatNumber());
System.out.println("Total Amount paid " + thanos.paymentMode("Cash"));
}
}


