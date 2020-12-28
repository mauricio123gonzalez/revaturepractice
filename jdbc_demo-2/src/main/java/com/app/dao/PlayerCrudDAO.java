package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerCrudDAO {
	
	public int createPlayer(Player player) throws BusinessException; //checked exceptions must be added to parent
	public void deletePlayer(int id);
	public int updatePlayerAge(int id, int newAge);
	public Player getPlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	

}
