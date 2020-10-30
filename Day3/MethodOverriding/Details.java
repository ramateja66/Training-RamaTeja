class Human
{
void age()
{
System.out.println("No age is mentioned");
}
void gender()
{
System.out.println("No gender");
}
}

class Shiva extends Human
{
void age()
{
System.out.println("Age of Shiva is 20 yrs");
}
void gender()
{
System.out.println("Gender:Male");
}
}

class Sneha extends Human
{
void age()
{
System.out.println("Age of Sneha is 35 yrs");
}
void gender()
{
System.out.println("Gender is Female");
}
}

public class Details
{
public static void main(String args[])
{
Human details=new Shiva();
details.age();
details.gender();
details=new Sneha();
details.age();
details.gender();
}
}


