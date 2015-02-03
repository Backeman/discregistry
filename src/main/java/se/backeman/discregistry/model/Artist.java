package se.backeman.discregistry.model;

public class Artist {
	int id;
	String name;

	Artist(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Artist(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}