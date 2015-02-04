package se.backeman.discregistry.model;

public class TopList {
	int id;
	String title;

	public TopList(String title) {
		this.title = title;
	}

	public TopList(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}