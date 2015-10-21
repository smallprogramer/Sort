package org.zz.Sort;
import org.zz.AbstractSortOne.AbstractSort;


public class InsertSort extends AbstractSort {

	@Override
	public void sort(int[] a) {
		
		// TODO Auto-generated method stub
		
		int N = a.length;
		
		for(int i = 1; i < N; i++){
			
			for(int j = i ; j>0 && less(a[j],a[j-1]); j--){
				
				exchange(a, j, j-1);
			}
	
		}

	}

}
