package com.revature.test;

import java.sql.SQLException;


import org.junit.Test;

import com.revature.db.Access;
import com.revature.db.Character;

public class testAccess {

	@Test
	public void testGetAccess() {

	}

	@Test
	public void testGetCharacter() {
		try {
			Character c = Access.getAccess().Character.getByID(1);
			System.out.println(c.getName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
