package com.revature.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class VehicleDB implements Accessible.VehicleAccess {

	private Connection con;
	private Map<String, PreparedStatement> ps;
	
	VehicleDB(Connection c) throws SQLException {
		con = c;
		ps = new HashMap<String, PreparedStatement>(1);
		ps.put("get by id", con.prepareStatement("SELECT * FROM vehicle WHERE id = ?;"));
	}
	
}
