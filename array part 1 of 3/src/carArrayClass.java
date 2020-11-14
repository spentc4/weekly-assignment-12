import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class carArrayClass {
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while(j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<car> cars = new PriorityQueue<car>(3, new carComparator());
		int[] a = new int[] {1,2,3,4,5};
		car car1 = new car(1,1,1,a);
		cars.add(car1);
		int[] b = new int[] {2,4,5,6,7};
		car car2 = new car(2,2,2,b);
		cars.add(car2);
		int[] c = new int[] {3,6,1,3,5};
		car car3 = new car(3,3,3,c);
		cars.add(car3);
		carComparator compare1 = new carComparator();
		
		System.out.println(SequentialSearch.contains(a, 1));
		System.out.println(SequentialSearch.contains(b, 2));
		System.out.println(SequentialSearch.contains(c, 3));
		System.out.println(BinarySearch.contains(a, 0));
		System.out.println(BinarySearch.contains(b, 0));
		System.out.println(BinarySearch.contains(c, 0));
		insertionSort(a);
		for (int element: a) {
			System.out.println(element);
		}
		System.out.println("\n");
		insertionSort(b);
		for (int element: b) {
			System.out.println(element);
		}
		System.out.println("\n");
		insertionSort(c);
		for (int element: c) {
			System.out.println(element);
		}
		System.out.println("\n");

		

		
		PriorityQueue<SUV> suvs = new PriorityQueue<SUV>(3, new suvComparator());
		SUV suv1 = new SUV(1,2,3,4,a);
		suvs.add(suv1);
		SUV suv2 = new SUV(5,6,7,8,b);
		// adding from other class to subclass inheritance
		//suvs.add((SUV)car1);
		
		suvs.add(suv2);
		SUV suv3 = new SUV(9,10,11,12,c);
		suvs.add(suv3);
		suvComparator compare2 = new suvComparator();
		System.out.println(SequentialSearch.contains(a, 1));
		System.out.println(SequentialSearch.contains(b, 2));
		System.out.println(SequentialSearch.contains(c, 3));
		System.out.println(BinarySearch.contains(a, 0));
		System.out.println(BinarySearch.contains(b, 0));
		System.out.println(BinarySearch.contains(c, 0));
	}
	static class carComparator implements Comparator<car>{
		public int compare(car car1,car car2, car car3) {
			return 0;
		}
		@Override
		public int compare(car o1, car o2) {
			return 0;
		}
	}
	static class suvComparator implements Comparator<SUV>{
		public int compare(SUV suv1,SUV suv2, SUV suv3) {
			return 0;
		}
		@Override
		public int compare(SUV o1, SUV o2) {
			return 0;
		}
	}

}
