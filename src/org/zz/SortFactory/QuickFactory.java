package org.zz.SortFactory;


import org.zz.AbstractSortOne.Sort;
import org.zz.ProFactory.SortFactoryPro;
import org.zz.Sort.QuickSort;

public class QuickFactory implements SortFactoryPro{

	@Override
	public Sort SortFactory() {
		
		return new QuickSort();
		
	}

	
	
	
}
