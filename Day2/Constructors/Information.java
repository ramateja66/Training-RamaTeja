class Person
{
int height;
int weight;
float width;
float salary;
long mobile_number;
long id_number;
String name;
String lastname;
String religion;
String nationality;
Person(int height,int weight,float width,float salary,long mobile_number,long id_number,String name,String lastname,String religion,String nationality)
{
this.height=height;
this.weight=weight;
this.width=width;
this.salary=salary;
this.mobile_number=mobile_number;
this.id_number=id_number;
this.name=name;
this.lastname=lastname;
this.religion=religion;
this.nationality=nationality;
}

void detailsOfPerson()
{
System.out.println("Name "+name+" LastName "+lastname+" Religion "+religion+" Height "+height+" Width " +width+" weight "+weight+" Salary "+salary+" Mobile Number " + mobile_number + " Id number " + id_number);
}
}
public class Information
{
public static void main(String args[])
{
/* Creating an object for person class */ 
Person shiva=new Person(10,50,17.5f,860.5f,889726,889745,"Shiva","Teja","Hind","Indian");
shiva.detailsOfPerson();
}
}
  



