package com.cg.Collection;

import java.util.Comparator;

public class SortByPlaytime  implements Comparator<Album> {

	@Override
	public int compare(Album a1, Album a2) {
		if(a1.getPlaytime()<=a2.getPlaytime())
			return -1;
			else
				return 1;
		
		
		
	}

}
