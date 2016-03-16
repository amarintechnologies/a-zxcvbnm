package com.erputil.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface SQLConnection {

	public ResultSet getSqlResult(String sql);
	public Connection getConnection();
	public void closeConnection();
}
