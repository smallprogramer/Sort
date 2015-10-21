package org.zz.Sort;

import org.zz.AbstractSortOne.AbstractSort;

public class BubbleSort extends AbstractSort{

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
	
		
		for(int i = 0 ; i < a.length - 1 ; i++ ){
			
			for(int j = 0 ; j < a.length - i - 1; j++ ){
				
				if( less(a[j+1] , a[j]) ){
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;										
				}
				
			}
					
		}
		
		
		
	}

	
	
	
}
