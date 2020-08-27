public class BubbleSort {
	
	/**
	 * BubbleSort (Sortieren durch Vertauschen)
	 *
	 * @param a Zu sortierendes Array
	 * @return Sortiertes Array
	 */
	public static int [] bubbleSort (int [] a) {
		//Sortierter Bereich a[i] ... a [n-1]
		for (int i = a.length; i > 0; i--) {
			//Unsortierter Bereich a[0] ... a[i-1]
			for (int j = 0; j < i - 1; j++) {
				//Werte a[j] und a[j+1] in falscher Reihenfolge?
				if (a[j] > a[j+1]) {
					//Werte vertauschen
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		return a;
	}
}
