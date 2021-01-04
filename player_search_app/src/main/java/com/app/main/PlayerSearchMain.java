package com.app.main;
import java.util.List;
//49 mins on christmas eve for steps
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to player search app...");
		System.out.println("--------");
		int ch=0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		do {
			System.out.println("Search Menu:");
			System.out.println("---------");
			System.out.println("1)By Id");
			System.out.println("2)By Name");
			System.out.println("3)By Team Id");
			System.out.println("4)By Age");
			System.out.println("5)By Gender");
			System.out.println("6)All Players");
			System.out.println("7) EXIT");
			System.out.println("Please choose between 1-9");
			try {
				ch=Integer.parseInt(sc.nextLine());
				
			}catch(NumberFormatException e) {
				
			}
			
			switch (ch) {
			case 1:
				System.out.println("Enter player ID for details");
				try {
					int id = Integer.parseInt(sc.nextLine());
					//code to service?
					Player player=playerSearchService.getPlayerById(id);
					if(player!=null) {
						System.out.println("Player id "+id+" details: ");
						System.out.println(player);
					}
				}catch (NumberFormatException e) {
					System.out.println("Invalid input");
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());;
				}
				break;
			case 2:
				System.out.println("Under construciton...");
				break;
			case 3:
				System.out.println("Enter player name: ");
				String name=sc.nextLine();
				
				break;
			case 4:
				System.out.println("Enter player age for details");
				try {
					int age = Integer.parseInt(sc.nextLine());
					//code to service?
					List<Player> agePlayersList = playerSearchService.getPlayersByAge(age);
					if(agePlayersList != null) {
						System.out.println("Players aged "+age+" details: ");
						for(Player p:agePlayersList) {
							System.out.println(p);
						}
					
					}
				}catch (NumberFormatException e) {
					System.out.println("Invalid input");
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());;
				}
				break;
			case 5:
				System.out.println("Gender: ");
				break;
			case 6:
				System.out.println("All Playerss: ");
				try {
					List<Player> allPlayersList=playerSearchService.getAllPlayers();
					if(allPlayersList!=null && allPlayersList.size()>0) {
						System.out.println("There are "+allPlayersList.size()+ "Details:");
						for(Player p:allPlayersList) {
							System.out.println(p);
						}
						
					}
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				System.out.println("Thank you for using Please Search App, gooodbye.");
				break;
			default:
				System.out.println("Invalid option, please retry");
				break;
			}
			
		}while(ch!=9);
		
	}

}
