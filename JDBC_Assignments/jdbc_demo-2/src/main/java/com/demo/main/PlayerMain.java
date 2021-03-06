package com.demo.main;

import java.util.List;

import com.demo.model.Player;
import com.demo.playerdao.PlayerDAO;
import com.demo.playerdao.impl.PlayerDAOImpl;

public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerDAO dao=new PlayerDAOImpl();
		
		//adding players
/*		Player p=new Player(110, "Raj", "Bangalore", 23, "M");
		
		int c=dao.addPlayer(p);
		if(c>0) {
			System.out.println("Player registered with below details");
			System.out.println(p);
		}else {
			System.out.println("Failure in registration");
		}  
		
		//getting players by id
		int id=102;
		Player player=dao.getPlayerById(id);
		if(player==null) {
			System.out.println("No player found with id "+id);
		}else {
			System.out.println("Player found with id = "+id+" and the details are below :");
			System.out.println(player);
		} 
		
		//changing players city by id
		int id=102;
		String newCity = "Chicago";
		int c = dao.updatePlayerCity(id, newCity);
		if(c>0) {
			System.out.println("Player updated");
		}else {
			System.out.println("Failure to update");
		} 
		
		//delete players
		int id=110;
		int c = dao.deletePlayer(id);
		if(c>0) {
			System.out.println("Player deleted");
		}else {
			System.out.println("Failure to delete");
		}  
		
		//get all players
		List<Player> playerList = dao.getAllPlayers();
		if (playerList.size() == 0) {
			System.out.println("No players as of now in DB");
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		} 
		
		//get all players by age
		int age = 23;
		List<Player> playerList =dao.getAllPlayersByAge(age);
		if (playerList.size() == 0) {
			System.out.println("No players as of now in DB");
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB");
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		} 
		
		//get all players by team name
		String teamName="ABC Riders";
		List<Player> playerList = dao.getAllPlayersByTeamName(teamName);
		if (playerList.size() == 0) {
			System.out.println("No players as of now from the teamName "+teamName);
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from team : "+teamName);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		} 
		
		
		//get all players by team location
		String location="Chennai";
		List<Player> playerList = dao.getAllPlayersByTeamLocation(location);
		if (playerList.size() == 0) {
			System.out.println("No players as of now from the location "+location);
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from the location : "+location);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		} 
		
		//get all players by teamid
		String teamid="T0001";
		List<Player> playerList = dao.getAllPlayersByTeamId(teamid);
		if (playerList.size() == 0) {
			System.out.println("No players as of now from the teamid "+teamid);
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from teamid : "+teamid);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		} */
		
		
		//get all players by city
		String city = "Bangalore";
		List<Player> playerList =dao.getAllPlayersByCity(city);
		if (playerList.size() == 0) {
			System.out.println("No players as of now in DB from the city " +city);
		} else {
			System.out.println("Total there are " + playerList.size() + " no of player/s in DB from city : " +city);
			System.out.println("Printing their details");
			for (Player p : playerList) {
				System.out.println(p);
			}
		}
	}

}
