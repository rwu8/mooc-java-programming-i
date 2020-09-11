import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

	public static int smallest(int[] array){
		int lowest = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < lowest) {
				lowest = num;
			}
		}

		return lowest;
	}

	public static int indexOfSmallest(int[] array) {
		int lowest = smallest(array);
		int index = 0;

		for (int i=0; i<array.length; i++) {
			if (array[i] == lowest) {
				index = i;
			}
		}
		return index;
	}


	public static int indexOfSmallestFrom(int[] table, int startIndex) {
		int lowest = Integer.MAX_VALUE;
		int index = 0;

		for (int i = startIndex; i < table.length; i++) {
			if (table[i] < lowest) {
				lowest = table[i];
				index = i;
			}
		}
		return index;
	}

	public static void swap(int[] array, int index1, int index2) {
		// write your code here
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void sort(int[] array) {
		// loop through array
		int index = 0;
		int smallestIndex = 0;
		int length = array.length;

		while (index < length) {
			// find smallest number
			smallestIndex = indexOfSmallestFrom(array, index);
			// move to lowest index
			swap(array, index, smallestIndex);
			// iterate through array from the lowest index found
			index++;
		}
	}
}
