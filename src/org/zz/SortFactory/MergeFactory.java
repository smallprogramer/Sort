package org.zz.SortFactory;

import org.zz.AbstractSortOne.Sort;
import org.zz.ProFactory.SortFactoryPro;
import org.zz.Sort.MergeSort;

public class MergeFactory implements SortFactoryPro{

	@Override
	public Sort SortFactory() {
		
		return new MergeSort();
	}

}
