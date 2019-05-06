package com.revature.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CharacterDB implements Accessible.CharacterAccess {

	private Connection con;
	private Map<String, PreparedStatement> psmap;
	private PreparedStatement ps;
	private ResultSet rs;

	CharacterDB(Connection c) throws SQLException {
		con = c;
		psmap = new HashMap<String, PreparedStatement>(1);
		psmap.put("get by id", con.prepareStatement("SELECT * FROM character WHERE id = ?;"));
	}

	public Character getByID(int id) throws SQLException {
		ps = psmap.get("get by id");
		ps.setInt(1, id);
		rs = ps.executeQuery();
		if (rs.next()) {
			return new Character(rs.getInt("id"), rs.getString("name"), rs.getString("voice_actor"),
					rs.getInt("birth_year"), rs.getInt("homeworld_id"), rs.getString("gender"),
					rs.getTimestamp("created"), rs.getTimestamp("modified"), rs.getInt("species_id"),
					rs.getBoolean("party_member"), rs.getBoolean("enemy"), rs.getBoolean("romanceable"));
		}
		return new Character();
	}

}
