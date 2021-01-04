package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		try(Connection connection=PostgresqlConnection.getConnection()) {
			String sql="select name,age,tid,gender from test.player where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(id);
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setTid(resultSet.getInt("tid"));
				player.setGender(resultSet.getString("gender"));
			}else {
				throw new BusinessException("No player with that id");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //take out when live
			throw new BusinessException("Internal error when getting player by id");
		}
		
			return player;
		}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList=new ArrayList<>();
		try(Connection connection=PostgresqlConnection.getConnection()) {
			String sql="select id,name,age,tid,gender from test.player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setTid(resultSet.getInt("tid"));
				player.setGender(resultSet.getString("gender"));
				playersList.add(player);
			}
			if (playersList.size()==0)
			{
				throw new BusinessException("No player in database...");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //take out when live
			throw new BusinessException("Internal error when getting player by id");
		}
		return playersList;

	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamId(int tid) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		Player player=null;
		try(Connection connection=PostgresqlConnection.getConnection()) {
			String sql="select name,age,tid,gender from test.player where age=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setTid(resultSet.getInt("tid"));
				player.setGender(resultSet.getString("gender"));
			}else {
				throw new BusinessException("No player with that age");
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //take out when live
			throw new BusinessException("Internal error when getting player age");
		}
		
			return (List<Player>) player;

	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
