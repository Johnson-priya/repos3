package com.cg.Collection;

import java.util.Comparator;

public class SortByComposer implements Comparator<Album>{

	@Override
	public int compare(Album a1, Album a2) {
		if(a1.getAlbumName().compareTo(a2.getAlbumName())>=1)
		
		return 1;
		else
			return -1;
	}

}