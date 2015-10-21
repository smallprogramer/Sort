package org.zz.Sort;

import org.zz.AbstractSortOne.AbstractSort;


public class SelectSort extends AbstractSort {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		
		int N = a.length;
				
		for(int i = 0; i < N; i++ ){
			
			for(int j = i+1; j < N ; j ++ ){
				
				int min = i;
				
				if(less(a[j] , a[min]))
					min = j;
				
				exchange(a , min , i);
				
			}
					
			
		}
	}

	
	
}
