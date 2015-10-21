package org.zz.AbstractSortTwo;

import org.zz.AbstractSortOne.AbstractSort;


public abstract class QuickAbstractSort extends AbstractSort{

	
	public int partition(int a[] , int lo , int hi){
		
		int i = lo;
		int j = hi+1;
		int v = a[lo];
		
		
		
		while(true){
			
			while(less(a[++i],v))
				if(i == hi)
					break;
			
			while(less(v,a[--j]))
				if(j == lo)
					break;
			
			if(i >= j)
				break;
			
			exchange(a , j , i);
			
		}
	
		exchange(a , lo , j );
		return j;
				
	}
	
	protected void sort(int[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		
		if(hi <= lo) 
			return;
		
		
		int j = partition(a , lo , hi);

		sort(a , lo , j-1);
		sort(a , j+1 , hi);

	}
	

}
