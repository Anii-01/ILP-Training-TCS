//11

package com.pra_practice;
import java.util.*;

class Player
{
	int playerId;
	String skill;
	String level;
	int points;
	
	public Player(int playerId, String skill,String level,int points)
	{
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}
	
	public static int findPointsForGivenSkill(ArrayList<Player>players,String skill)
	{
		int sum =0;
		
		for(Player ps : players)
		{
			if((ps.skill).equalsIgnoreCase(skill))
			{
				sum = sum+ps.points;
			}
		}
		if(sum == 0)
		{
			return 0;
		}
		return sum;
	}
	
	public static Player getPlayerBasedOnLevel(ArrayList<Player>players, String tlevel, String tskills)
	{
		for(Player ps : players)
		{
			if(((ps.level).equalsIgnoreCase(tlevel)) && ((ps.skill).equalsIgnoreCase(tskills)) && ((ps.points) >= 20))
			{
				return ps;
			}
		}
		return null;
	}
}


public class PlayerMain {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Player> players = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String skill = sc.nextLine();
			String level = sc.nextLine();
			int points = sc.nextInt();
			
			Player p = new Player(id,skill,level,points);
			players.add(p);
			
		}
		
		sc.nextLine();
		String str = sc.nextLine();
		int res = Player.findPointsForGivenSkill(players,str);
		System.out.println(res);
		
		String str2 = sc.nextLine();
		Player obj = Player.getPlayerBasedOnLevel(players,str2,str);
		if(obj==null)
		{
			System.out.println("Null");
		}
		else
		{
			System.out.println(obj.playerId);
		}
		sc.close();
	}
}
