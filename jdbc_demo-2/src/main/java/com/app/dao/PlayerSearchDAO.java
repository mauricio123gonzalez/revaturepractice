package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerByAge (int age) throws BusinessException;
	public List<Player> getPlayersByGender(String gender) throws BusinessException;

}
