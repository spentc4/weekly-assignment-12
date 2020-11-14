
public class BinarySearch {
public static boolean contains(int[] a, int b) {
	if (a.length == 0) {
		return false;
	}
	int lower = 0;
	int higher = a.length - 1;
	
	while(lower <= higher) {
		int mid = (lower + higher) / 2;
		if (b>a[mid]) {
			lower = mid + 1;
		} else if (b < a[mid]) {
			higher = mid -1;
		} else {
			return true;
		}
	}
	return false;
}
}
