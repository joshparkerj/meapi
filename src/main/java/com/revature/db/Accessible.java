package com.revature.db;

import java.sql.SQLException;

public interface Accessible {

	interface LocationAccess {
		
	}
	
	interface SpeciesAccess {
		
	}
	
	interface CharacterAccess {
		Character getByID(int id) throws SQLException;
	}
	
	interface GameAccess {
		
	}
	
	interface VehicleAccess {
		
	}
	
	interface FactionAccess {
		
	}
	
	interface MissionAccess {
		
	}
	
}
