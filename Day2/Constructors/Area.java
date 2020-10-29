class Circle 
{
int length;
int tangent;
int arcs_number;
float perimeter;
float angle; 
float degrees;
String circle_name;
String theorem_name;
String disc;
String segment_name;
Circle(int length,int tangent,int arcs_number,float perimeter,float angle,float degrees,String circle_name,String theorem_name,String disc,String segment_name)
{
this.length=length;
this.tangent=tangent;
this.arcs_number=arcs_number;
this.perimeter=perimeter;
this.angle=angle;
this.degrees=degrees;
this.circle_name=circle_name;
this.theorem_name=theorem_name;
this.disc=disc;
this.segment_name=segment_name;
this.detailsOfCircle();
}

void detailsOfCircle()
{
System.out.println("Length-"+length+" Tangent-"+tangent+" Arcs number-"+arcs_number+" Perimeter-"+perimeter+" Angle-"+angle+" Degree-"+degrees+" Circle Name-" +circle_name+" Theorem name-" +theorem_name+" Disc-" +disc+" Segment Name-"+segment_name);
}
}
public class Area
{
public static void main(String args[])
{
Circle semi=new Circle(10,20,30,40.5f,36.5f,360.5f,"SemiCircle","Pythogorus","Compact","Tangent");
}
}
 
