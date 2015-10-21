package org.zz.SortFactory;

import org.zz.AbstractSortOne.Sort;
import org.zz.ProFactory.SortFactoryPro;
import org.zz.Sort.SelectSort;

public class SelectFactory implements SortFactoryPro{

	@Override
	public Sort SortFactory() {
		
		return new SelectSort();
		
	}

}
