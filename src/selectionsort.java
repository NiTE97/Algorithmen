public class SelectionSort {
	/**
	 * SelectionSort (Sortieren durch Auswaehlen)
	 *
	 * @param a Zu sortierendes Array
	 * @return Sortiertes Array
	 */
	public static int [] selectionSort(int [] a) {
		for (int i = 0; i < a.length; i++) {
			// Position des Minimums bestimmen
			int minPos = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[minPos]) {
					minPos = j;
				}
			}
			// Minimum an Beginn stellen
			int t = a[i];
			a[i] = a[minPos];
			a[minPos] = t;
		}
		return a;
	}
}
