package se.backeman.discregistry.model;

public class Song {
	int id;
	String name;
	Artist artist;

	public Song(int id, String name, Artist artist) {
		this.id = id;
		this.name = name;
		this.artist = artist;
	}

	public Song(String name, Artist artist) {
		this.name = name;
		this.artist = artist;
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