package com.app.main;


import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerCrudDAO dao=new PlayerCrudDAOImpl();
		
//		Player p=new Player(9, "Lippy", 68, 101, "F");
//		
//		try {
//			if(dao.createPlayer(p)!=0) {
//				System.out.println("Player created...");
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		try {
			Player player=dao.getPlayerById(2);
			if(player!=null) {
				System.out.println("Details of player with id "+player.getId());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			List<Player> playersList=dao.getAllPlayers();
			if(playersList!=null && playersList.size()!=0) {
				System.out.println("Found "+playersList.size()+" players, printing...");
				for(Player p:playersList) {
					System.out.println(p);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
