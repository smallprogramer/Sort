package test;


import org.zz.AbstractSortOne.Sort;
import org.zz.ProFactory.SortFactoryPro;
import org.zz.SortFactory.QuickFactory;



public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,6,2,9,7,5,10};
		SortFactoryPro pfc = new QuickFactory();
		Sort sort = pfc.SortFactory();
		sort.sort(a);
		
		for(int i = 0 ; i < a.length ; i++){
			
			System.out.println(a[i]);
			
		}
		
		
  }
	
	
}