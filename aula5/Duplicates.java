package aula5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Duplicates {

public List<Integer>findDuplicates (List<Integer> numbers){
	List<Integer> duplicates = new ArrayList<>();
	Set<Integer> uniqueNumbers = new HashSet<>();
	
	for (Integer number : numbers) {
		if (uniqueNumbers.contains(number)) {
			duplicates.add(number);
		} else {
		uniqueNumbers.add(number);
	}
	}
		return duplicates;
	}
}

//public static void nain(String[] args) {
//    Duplicates d = new Duplicates(); 
//    List<Integer> n = new ArrayList<>();
//    n.add(1);
//    n.add(2);
//    n.add(3);
//    n.add(1);
//    n.add(2);
//    n.add(4);
//    n.add(3);
//    n.add(5);
//    List<Integer> resp =d.findDuplicates(n);
//    System.out.println(Arrays.toString(resp.toArray()));
//    }
//}





