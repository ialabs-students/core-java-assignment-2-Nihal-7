package iaassignment2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
	public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> l) {
	    Collections.sort(l,Collections.reverseOrder());
	    return l;
	}
	public static void main(String[] args) {
		

	ArrayList<BigInteger> l=new ArrayList<>();
	l.add(new BigInteger("752001"));
	l.add(new BigInteger("1120"));
	l.add(new BigInteger("7"));
	l.add(new BigInteger("11"));
	l.add(new BigInteger("20"));
	
	System.out.println(arrayListSortDesc(l));
	
	}	

}
