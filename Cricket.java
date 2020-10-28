class Batsman
{
String player_name;
int total_runs;
int total_matches;
int tshirt_number;
float strike_rate;
float average_runs;
char hand_position;
char married;
String nick_name;
String team_name;
static String status;
} 
class Bowler
{
String bowler_name;
int total_wickets;
int total_matches;
float economy;
float bowling_speed;
char married;
char hand_position;
String team_name;
String nick_name;
String locality;
static String status;
}
public class Cricket
{
public static void main(String args[])
{
/* Creating a Batsman object */ 
Batsman dhoni=new Batsman();
dhoni.player_name="Mahendra Singh Dhoni";
dhoni.total_runs=2560;
dhoni.tshirt_number=7;
dhoni.total_matches=75;
dhoni.strike_rate=156.7f;
dhoni.average_runs=51.23f;
dhoni.hand_position='R';
dhoni.married='Y';
dhoni.team_name="India";
dhoni.nick_name="Mahi";
Batsman.status="Batsman";
/* Creating a Bowler Object */ 
Bowler starc=new Bowler();
starc.bowler_name="Mike Starc" ;
starc.total_wickets=10;
starc.total_matches=20;
starc.economy=8.6f;
starc.bowling_speed=148.4f;
starc.hand_position='L';
starc.married='N';
starc.nick_name="Mike";
starc.locality="Sydney";
starc.team_name="Australia";
Bowler.status="Bowler";
System.out.println("*****************Batsman-Details******************");
System.out.println("Player Full Name: " + dhoni.player_name);
System.out.println("Total Runs :" + dhoni.total_runs);
System.out.println("Total Matches :" + dhoni.total_matches);
System.out.println("T-Shirt Number :" + dhoni.tshirt_number);
System.out.println("Strike Rate :" + dhoni.strike_rate);
System.out.println("Average Runs :" + dhoni.average_runs);
System.out.println("Batting Position :" + dhoni.hand_position);
System.out.println("Married(Y/N) :" + dhoni.married);
System.out.println("Team Name :" + dhoni.team_name);
System.out.println("Nick Name :" + dhoni.nick_name);
System.out.println("Player Status :" + Batsman.status);
System.out.println("*****************Bowler-Details******************");
System.out.println("Player Full Name :" + starc.bowler_name);
System.out.println("Total Wickets :" + starc.total_wickets);
System.out.println("Total Matches :" + starc.total_matches);
System.out.println("Bowler Economy :" + starc.economy);
System.out.println("Bowling Speed :" +starc.bowling_speed);
System.out.println("Bowler Hand Position :" + starc.hand_position);
System.out.println("Married(Y/N) :" + starc.married);
System.out.println("Born city :" + starc.locality);
System.out.println("Team Name :" + starc.team_name);
System.out.println("Player Status :" + Bowler.status);
}
}
