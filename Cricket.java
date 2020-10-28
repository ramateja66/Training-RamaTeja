class Batsman
{
String player_name;
int total_runs;
float strike_rate;
char hand_position;
String team_name;
static String status;
} 
class Bowler
{
String bowler_name;
int total_wickets;
float economy;
char hand_position;
String team_name;
static String status;
}
public class Cricket
{
public static void main(String args[])
{
/* Creating a Batsman object */ 
Batsman batting=new Batsman();
batting.player_name="Mahendra Singh Dhoni";
batting.total_runs=2560;
batting.strike_rate=156.7f;
batting.hand_position='R';
batting.team_name="India";
Batsman.status="Batsman";
/* Creating a Bowler Object */ 
Bowler bowling=new Bowler();
bowling.bowler_name="Mike Starc" ;
bowling.total_wickets=10;
bowling.economy=8.6f;
bowling.hand_position='L';
bowling.team_name="Australia";
Bowler.status="Bowler";
System.out.println("*****************Batsman-Details******************");
System.out.println("Player Name " + batting.player_name);
System.out.println("Total Runs " + batting.total_runs);
System.out.println("Strike Rate " + batting.strike_rate);
System.out.println("Batting Position " + batting.hand_position);
System.out.println("Team Name " + batting.team_name);
System.out.println("Player Status " + Batsman.status);
System.out.println("*****************Batsman-Details******************");
System.out.println("Player Name " + bowling.bowler_name);
System.out.println("Total Wickets " + bowling.total_wickets);
System.out.println("Bowler Economy " + bowling.economy);
System.out.println("Bowler Hand Position" + bowling.hand_position);
System.out.println("Team Name " + bowling.team_name);
System.out.println("Status " + Bowler.status);
}
}
