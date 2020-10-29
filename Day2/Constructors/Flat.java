class Home
{
int house_number;
int construction_date;
int door_number;
float height;
float distance;
float area;
String located_area;
String lane_name;
String home_name;
String owner_name;
Home(int house_number,int construction_date,int door_number,float height,float distance,float area,String located_area,String lane_name,String home_name,String owner_name)
{
this.house_number=house_number;
this.construction_date=construction_date;
this.door_number=door_number;
this.height=height;
this.distance=distance;
this.area=area;
this.located_area=located_area;
this.lane_name=lane_name;
this.home_name=home_name;
this.owner_name=owner_name;
}
void property()
{
System.out.println("House Number-"+house_number+"Date-"+construction_date+"Door Number-"+door_number+"Height-"+height+"Distance-"+distance+"Area-"+area+"Located Area-"+located_area+"Lane Name-"+lane_name+"Home Name-"+home_name+"Owner Name-"+owner_name);
}
}
public class Flat
{
public static void main(String args[])
{
Home building=new Home(10,2019,45,45.5f,17.6f,356.5f,"Kondapur","Nivas","Sai krupa","Kiran");
building.property();
}
}



