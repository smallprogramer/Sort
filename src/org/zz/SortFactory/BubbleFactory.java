package org.zz.SortFactory;

import org.zz.AbstractSortOne.Sort;
import org.zz.ProFactory.SortFactoryPro;
import org.zz.Sort.BubbleSort;

public class BubbleFactory implements SortFactoryPro{

	@Override
	public Sort SortFactory() {
		
		return new BubbleSort();
	}

}
