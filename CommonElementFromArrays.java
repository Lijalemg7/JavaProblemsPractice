package twentytwo;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementFromArrays {

	public static void main(String[] args) {
		String[] Ar1 = {"Python", "SQL","json", "ph","DB"};
		String[] Ar2 = {"DB", "CODE", "SQL"};
		System.out.println(Arrays.toString(Ar1));
		System.out.println(Arrays.toString(Ar2));
		HashSet<String> set = new HashSet<String>();
		for ( int i = 0; i < Ar1.length; i++) {
			for (int j = 0; j < Ar2.length; j++) {
				if (Ar1[i].equals(Ar2[j])) {
					set.add(Ar1[i]);
				}
			}
		}System.out.println("Common element" +set);
	}

	}

