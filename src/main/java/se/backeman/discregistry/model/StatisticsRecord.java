package se.backeman.discregistry.model;

public class StatisticsRecord {

	private int id;
	private Song song;
	private TopList toplist;
	private int place;
	private int month;

	public StatisticsRecord(Song song, TopList toplist, int place, int month) {
		this.song = song;
		this.toplist = toplist;
		this.place = place;
		this.month = month;
	}

	public StatisticsRecord(int id, Song song, TopList toplist, int place, int month) {
		this.id = id;
		this.song = song;
		this.toplist = toplist;
		this.place = place;
		this.month = month;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public TopList getToplist() {
		return toplist;
	}

	public void setToplist(TopList toplist) {
		this.toplist = toplist;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
}