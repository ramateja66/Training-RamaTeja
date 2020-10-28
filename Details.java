class Student 
{
int student_id;
float student_percentage;
String student_group;
static String college_name;
}
class Employee
{
int employee_id;
int employee_salary;
String employee_location;
String employee_designation;
static String company_name;
}
public class Details
{
public static void main(String args[])
{


/* Creating Student Object */
Student teja=new Student();
teja.student_id=102;
teja.student_percentage=76.8f;
teja.student_group="Information Technology";
Student.college_name="ACE";
System.out.println("**************Student-Details******************");
System.out.println("Student id " + teja.student_id);
System.out.println("Student percentage " + teja.student_percentage);
System.out.println("Student Group "  + teja.student_group);
System.out.println("Student College " + Student.college_name);

/* Creating Employee object */
Employee kiran=new Employee();
kiran.employee_id=5642;
kiran.employee_salary=15000;
kiran.employee_location="Hyderabad";
kiran.employee_designation="Software-developer";
Employee.company_name="TCS" ;
System.out.println("**********Employee-Details**********");
System.out.println("Employee id " + kiran.employee_id);
System.out.println("Employee Salary " +kiran.employee_salary);
System.out.println("Employee Location " + kiran.employee_location);
System.out.println("Employee designation " + kiran.employee_designation);
System.out.println("Company Name " + Employee.company_name);
}
}
