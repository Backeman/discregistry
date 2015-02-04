package se.backeman.discregistry.start;

import se.backeman.discregistry.model.Artist;
import se.backeman.discregistry.model.Song;
import se.backeman.discregistry.model.StatisticsRecord;
import se.backeman.discregistry.model.TopList;

public class StartApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Artist a = new Artist("Foobar");
		Song s = new Song("Låt", a);
		TopList tl = new TopList("KvT");
		StatisticsRecord sr = new StatisticsRecord(s, tl, 1, 2);

		System.out.println("Stats: " + sr.getPlace() + " place in month " + sr.getMonth() + " for the song '" + s.getName() + "' by '" + a.getName() + "'");
	}

}
