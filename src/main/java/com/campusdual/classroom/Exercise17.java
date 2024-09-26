package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		return new int[positions];
	}

	public static String[] createInitializedStringArray() {
        return new String[0];
    }

	public static void populateArray(int[] array, int index, int value) {}

	public static int arrayLength(int[] array) {
        return 0;
    }

	public static void showValue(int[] array, int index) {}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
		String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
