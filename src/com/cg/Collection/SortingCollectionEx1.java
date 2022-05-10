package com.cg.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCollectionEx1 {

	public static void main(String[] args) {
		Album a1 = new Album("Eighth Blackbird", "Fred", 2000, 3 );
		Album a2 = new Album("Alone", "Alan Walker", 2010, 4 );
		Album a3 = new Album("Moonlight", "James", 2009, 7 );
		Album a4 = new Album("Abc", "Ford", 2008, 6 );
		Album a5 = new Album("Def", "Rhodes", 2007, 2 );
		ArrayList<Album> albumL = new ArrayList<Album>();
		albumL.add(a1);
		albumL.add(a2);
		albumL.add(a3);
		albumL.add(a4);
		albumL.add(a5);
		for(Album a : albumL) {
			System.out.println(a);
		}
		Collections.sort(albumL);
		System.out.println("....SORTED BY RELEASR DATE....");
		for(Album a:albumL) {
			System.out.println(a);
		}
		Collections.sort(albumL, new SortedByAlbumName());
		 System.out.println("...SORTED BY ALBUMNAME ...");
		 for(Album a:albumL) {
			 System.out.println(a);
		 }
		 Collections.sort(albumL, new SortByComposer());
		 System.out.println("...SORT BY COMPOSER NAME...");
		 for(Album a:albumL) {
			 System.out.println(a);
		 }
		 Collections.sort(albumL, new SortByPlaytime());
		 System.out.println("...SORTED BY PLAYTIME...");
		 for(Album a:albumL) {
			 System.out.println(a);
		 }



	}

}
