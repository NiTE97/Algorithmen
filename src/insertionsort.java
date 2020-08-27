public class InsertionSort {
	/**
	 * InsertionSort (Sortieren durch Einfuegen)
	 *
	 * @param a Zu sortierendes Array
	 * @return Sortiertes Array
	 */
	public static int[] insertionSort (int [] a) {
		// Betrachte den Wert a[i]
		for (int i = 0; i < a.length; i++) {
			//Fuege a[i] in a[0] ... a[i-1] ein
			for (int j = i; j >= 0; j--) {
				if (a[j] > a[j+1]) {
					// Werte vertauschen
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		return a;
	}
}
