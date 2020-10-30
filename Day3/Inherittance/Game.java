class Sports
{
void numberOfPlayers()
{
System.out.println("Number of players are 2");
}
}
class Indoor extends Sports
{
void gameType()
{
System.out.println("Game type is Indoor ");
}
}
class Chess extends Indoor
{
void requirement()
{
System.out.println("Chess needs chess board to play ");
}
}

public class Game
{
public static void main(String args[])
{
Chess black=new Chess();
black.numberOfPlayers();
black.gameType();
black.requirement();
}
}
