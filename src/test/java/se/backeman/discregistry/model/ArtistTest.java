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
	public void testGetId() {
		Assert.assertEquals(1,  this.artist.getId());		
	}
	
	@Test 
	public void testGetIdFails() {
		Assert.assertFalse(this.artist.getId() == 2);
	}
	
	@Test
	public void testGetName() {
		Assert.assertEquals("foobar", this.artist.getName());
	}
}