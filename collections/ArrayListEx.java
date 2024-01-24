package collections;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		l.set(0, 0);
		System.out.println(l);
		

		
		l.forEach((Integer e)->{
			System.out.println(e);
		}
		);

	}

}
