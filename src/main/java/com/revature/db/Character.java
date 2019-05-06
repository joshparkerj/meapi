package com.revature.db;

import java.io.Serializable;
import java.sql.Timestamp;

public class Character implements Serializable {

	private static final long serialVersionUID = 4104549212080243032L;
	private int id;
	private String name;
	private String voiceActor;
	private int homeworld_id;
	private String gender;
	private Timestamp created;
	private Timestamp modified;
	private int speciesID;
	private boolean party_member;
	private boolean enemy;
	private boolean romanceable;

	public Character() {

	}

	public Character(int i, String n, String v, int b, int h, String g, Timestamp c, Timestamp m, int s, boolean p,
			boolean e, boolean r) {
		id = i;
		name = n;
		voiceActor = v;
		homeworld_id = h;
		gender = g;
		created = c;
		modified = m;
		speciesID = s;
		party_member = p;
		enemy = e;
		romanceable = r;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVoiceActor() {
		return voiceActor;
	}

	public void setVoiceActor(String voiceActor) {
		this.voiceActor = voiceActor;
	}

	public int getHomeworld_id() {
		return homeworld_id;
	}

	public void setHomeworld_id(int homeworld_id) {
		this.homeworld_id = homeworld_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getCreated() {
		return created;
	}

	public Timestamp getModified() {
		return modified;
	}

	public int getSpeciesID() {
		return speciesID;
	}

	public void setSpeciesID(int speciesID) {
		this.speciesID = speciesID;
	}

	public boolean isParty_member() {
		return party_member;
	}

	public void setParty_member(boolean party_member) {
		this.party_member = party_member;
	}

	public boolean isEnemy() {
		return enemy;
	}

	public void setEnemy(boolean enemy) {
		this.enemy = enemy;
	}

	public boolean isRomanceable() {
		return romanceable;
	}

	public void setRomanceable(boolean romanceable) {
		this.romanceable = romanceable;
	}

}
