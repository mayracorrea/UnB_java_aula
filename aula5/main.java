package aula5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main{
public static void main (String[] args) {
	    Duplicates d = new Duplicates(); 
	    List<Integer> n = new ArrayList<>();
	    n.add(1);
	    n.add(1);
	    n.add(2);
	    n.add(3);
	    n.add(4);
	    n.add(5);
	    n.add(2);
	    n.add(4
	    		);
		    List<Integer> resp =d.findDuplicates(n);
	    System.out.println(Arrays.toString(resp.toArray()));
	    }
}
	

