package com.erputil.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erputil.dao.SQLConnection;
@Repository
public class SQLConnectionImpl implements SQLConnection{
	

	@Autowired
	private DataSource dataSource;
	
	private Connection conn = null;
	private Statement statement = null;
	private ResultSet resultSet = null;


	public ResultSet getSqlResult(String sql) {
		
		try {
			
			
			conn = dataSource.getConnection();
			
			
			if(conn!=null)
			{
				
			statement = conn.createStatement();
			resultSet = statement.executeQuery(sql);
			}
			else
			{
				
			}
		} catch (SQLException e) {
			
			try {
				conn.close();
				statement.close();
				resultSet.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
				
		return resultSet;
	}
	
	public Connection getConnection()
	{
		
		
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
		
	}
	public void closeConnection()
	{
		try {
			conn.close();
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}



}
