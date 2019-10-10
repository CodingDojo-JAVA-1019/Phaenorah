package com.codingdojo.web.models;

public class Team {
	private String team_name;
	private String players; 
	public static int numberOfPlayers = 0;
	
	public Team() {		
	}	
	public Team (String team_name, String players) {
		this.team_name= team_name;
		this.players = players;
		numberOfPlayers++;
	}
	public String getTeamName() {
		return team_name;
	}
	public void setTeamName(String team_name) {
		this.team_name= team_name;
	}
	public String getPlayers() {
		return players;
	}
	public void setPlayers(String players) {
		this.players= players;
	}
	public static int getNumberOfPlayers() {
		return numberOfPlayers;
	}
}
