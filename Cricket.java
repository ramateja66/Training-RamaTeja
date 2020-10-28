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
Batsman dhoni=new Batsman();
dhoni.player_name="Mahendra Singh Dhoni";
dhoni.total_runs=2560;
dhoni.strike_rate=156.7f;
dhoni.hand_position='R';
dhoni.team_name="India";
Batsman.status="Batsman";
/* Creating a Bowler Object */ 
Bowler starc=new Bowler();
starc.bowler_name="Mike Starc" ;
starc.total_wickets=10;
starc.economy=8.6f;
starc.hand_position='L';
starc.team_name="Australia";
Bowler.status="Bowler";
System.out.println("*****************Batsman-Details******************");
System.out.println("Player Full Name " + dhoni.player_name);
System.out.println("Total Runs " + dhoni.total_runs);
System.out.println("Strike Rate " + dhoni.strike_rate);
System.out.println("Batting Position " + dhoni.hand_position);
System.out.println("Team Name " + dhoni.team_name);
System.out.println("Player Status " + Batsman.status);
System.out.println("*****************Batsman-Details******************");
System.out.println("Player Full Name " + starc.bowler_name);
System.out.println("Total Wickets " + starc.total_wickets);
System.out.println("Bowler Economy " + starc.economy);
System.out.println("Bowler Hand Position" + starc.hand_position);
System.out.println("Team Name " + starc.team_name);
System.out.println("Status " + Bowler.status);
}
}
