package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		for(int i = 0;i < array.length -1 ;i++) {
			for(int j = 1;i < array.length;j++) {
				if(array[i].compareTo(array[j]) < 0) {
					Util.swap(array,i,j);
				}
			}
		}
	}
}