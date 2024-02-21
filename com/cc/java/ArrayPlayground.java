package com.cc.java;

public class ArrayPlayground {

	static int [] numArr = {2,4,6,7,20,3,6,6,7,89};
	// static String strArr = {"Ich", "bin", "Maxine", "Mützerich"};

    public static void main(String[] args) {

		// System.out.ptintln(numArr);

		outputArr();

		numArr[0] = 100;

		System.err.println("Elemente:" + numArr.length);
		// numArr[3] = 101;
		numArr[numArr.length-1] = 101;

		outputArr();
	}


	static void outputArr(){



		System.out.println("---------------------------------------");

		//System.out.print(numArr[0] + ",");
		//System.out.print(numArr[1] + ",");
		//System.out.print(numArr[2] + ",");
		//System.out.print(numArr[3] + ",");
		//System.out.println(numArr[4] + ",");

	for (int i = 0; i < numArr.length; i++) { 
		if (i < numArr.length -1) {
			System.err.print(numArr[i] + ",");
			


		} else {
			System.err.println(numArr[i]);
			

		}
	}
	System.out.println("---------------------");
}

}