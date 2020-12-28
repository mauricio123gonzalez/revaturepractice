package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOImpl  implements PlayerCrudDAO{

	//This accomplishes steps 1, 2, and 6
	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=PostgresqlConnection.getConnection()){
			String sql = "insert into test.player(id,name,age,tid,gender) values(?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//Step 3, create statement
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setInt(4, player.getTid());
			preparedStatement.setString(5, player.getGender());
			
			c=preparedStatement.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //only used for testing, take off when live
			throw new BusinessException("Internal error");
		}
		return c;
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		// Task
		String sql="delete from test.player where id=?";
		
	}

	@Override
	public int updatePlayerAge(int id, int newAge) {
		// TODO Auto-generated method stub
		//Task
		String sql="update test.player set age=? where id=?";
		return 0;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
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
	
	
	public List<Player> getAllPlayers() throws BusinessException{
		// TODO Auto-generated method stub
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

}
