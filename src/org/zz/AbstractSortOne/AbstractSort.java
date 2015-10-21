package org.zz.AbstractSortOne;

public class AbstractSort implements Sort{

	@Override
	public void sort(int[] a) {

	}
	
	
	
	public boolean less(int a , int b){
		
			return a < b;
			
	}
	
	public void exchange(int[] t , int a , int b){
		
		int v = t[a];		
		t[a] = t[b];
		t[b] = v;
	
	}
	
	public void Outprint(int a[]){
		
		for(int b : a ){
			
			System.out.print(b + ".");
			
		}
		
		System.out.println("");
		
	}

	
	
	
}
