package twentytwo;

import java.util.Arrays;

public class CommonIntegerBtweenArray{

	public static void main(String[] args) {
		int [] Ar1 = {23, 24, 25, 39, 8, 43,67};
		int [] Ar2 = {12, 23, 39, 55, 2, 45};
		System.out.println(Arrays.toString(Ar1));
		System.out.println(Arrays.toString(Ar2));
		for ( int i = 0; i < Ar1.length; i++) {
			for (int j = 0; j < Ar2.length; j++) {
				if (Ar1[i] ==Ar2[j]){
					System.out.println(Ar1[i]);
					}
			}
	}

	}
}
