package se.backeman.discregistry.model;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class ArtistTest {

	Artist artist;
	@Before
	public void setUp() throws Exception {
		this.artist = new Artist(1, "foobar");
	}

	@Test
	public void test() {
		Assert.assertEquals(1,  this.artist.getId());		
	}
}