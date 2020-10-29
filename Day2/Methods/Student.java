class University
{
void listOfColleges()
{
System.out.println("1.Anurag 2.TKR 3.CBIT 4.JBIT 5.NNRG");
}
void selectCollege(String college_name)
{
System.out.println("Selected College is " + college_name);
}
int seatAlloted()
{
return 1;
}
String payFee(int fee)
{
System.out.println("Total fee is " + fee);
return "Paid";
}
}
class Student 
{
public static void main(String args[])
{
/* Creating an object for University */ 
University jntu=new University();
/* Calling Methods */ 
jntu.listOfColleges();
jntu.selectCollege("CBIT");
System.out.println("Seat Alloted is " + jntu.seatAlloted());
System.out.println("Fees Status : " + jntu.payFee(10000));
}
}

