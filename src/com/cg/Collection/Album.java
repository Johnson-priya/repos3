package com.cg.Collection;

public class Album implements Comparable<Album> {
	private String albumName;
	private String composer;
	private int yearOfRelease;
	private float playtime;
	public Album(String albumName, String composer, int yearOfRelease, float playtime) {
		super();
		this.albumName = albumName;
		this.composer = composer;
		this.yearOfRelease = yearOfRelease;
		this.playtime = playtime;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public float getPlaytime() {
		return playtime;
	}

	

	public void setPlaytime(float playtime) {
		this.playtime = playtime;
	}
	@Override
	public String toString() {
		return "Album [albumName=" + albumName + ", composer=" + composer + ", yearOfRelease=" + yearOfRelease + ", playtime="
				+ playtime + "]";
	}

	public static void main(String[] args) {
		
	}

	@Override
	public int compareTo(Album a) {
		if(this.yearOfRelease<a.yearOfRelease)
		
		return 1;
		else
			return -1;
	}

}
