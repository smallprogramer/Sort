package org.zz.SortFactory;


import org.zz.AbstractSortOne.Sort;
import org.zz.ProFactory.SortFactoryPro;
import org.zz.Sort.InsertSort;


public class InsertFactory implements SortFactoryPro{

	
	public Sort SortFactory(){
		
		return new InsertSort();
	}
	
}
