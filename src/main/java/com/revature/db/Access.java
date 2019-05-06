package com.revature.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Access implements Accessible {

	Connection con;
	public LocationAccess Location;
	public GameAccess Game;
	public MissionAccess Mission;
	public SpeciesAccess Species;
	public VehicleAccess Vehicle;
	public CharacterAccess Character;
	public FactionAccess Faction;

	private static Access uniqueInstance = null;

	public static Access getAccess() throws SQLException {
		if (uniqueInstance == null)
			uniqueInstance = new Access();
		return uniqueInstance;
	}

	private Access() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/meapi");
			Location = new LocationDB(con);
			Game = new GameDB(con);
			Mission = new MissionDB(con);
			Species = new SpeciesDB(con);
			Vehicle = new VehicleDB(con);
			Character = new CharacterDB(con);
			Faction = new FactionDB(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
