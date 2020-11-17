package com.xworkz.collectionconcept.sorting;

import java.util.Comparator;

public class SortKeyByMaterial implements Comparator<Key>{

	@Override
	public int compare(Key o1, Key o2) {
		return o1.getMaterial().compareTo(o2.getMaterial());
	}

}
