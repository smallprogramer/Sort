package org.zz.AbstractSortTwo;

import org.zz.AbstractSortOne.AbstractSort;

public class MergeAbstractSort extends AbstractSort {


	

	public void merge(int a[] , int lo , int mid , int hi){
		
		int i = lo;
		int j = mid+1;
		int aex[] = null;
		
		
		for(int v = lo ; v <= hi ; v++){			
			aex[v] = a[v];			
		}
		
		for(int h = lo ; h <= hi ; h++){
			
			if(i > mid) 
				a[h] = aex[j++];
			
			if(j > hi)
				a[h] = aex[i++];
			
			if(less(aex[j],aex[i]))
				a[h] = aex[j];
			
			else
				a[h] = a[i];
					
			
		}
		
	
	}
	
	protected void Sort(int a[] , int lo , int hi){
		
		if(lo >= hi) 
			return;
		
		int mid = (lo + hi)/2;
		
		Sort(a , lo , mid);
		Sort(a , mid+1 , hi);
		
		merge(a , lo , mid , hi);
		
	}

}
