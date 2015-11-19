
public class bootCamp2 {

	public static void main(String[] args) {
		int[] test = { 1, 2, 3, 4, 5, -1 };
		System.out.println(smallest(test));
	}
// task 1
	public static int smallest(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] <= num[i + 1]) {
				min = num[i];

			} else if (num[i + 1] <= num[i]) {
				min = num[i + 1];

			}

		}
		return min;

	}
//Task 2
	public static int[] populateArray(int num1, int num2, int num3) {
		int[] x = new int[num3];
		for (int i = num1; i < num2; i++) {
			x[i] = (int) (Math.random() * 10);

		}
		return x;

	}
// Task 3
	public static double[] populateArray(double num1, double num2, int num3) {
		double[] x = new double[num3];
		for (int i = (int) num1; i < num2; i++) {
			x[i] = (Math.random() * 10);

		}
		return x;
	}

//Task 4	
	public static int[] grow2 (int[] num) {
		int[] y = new int[2 * num.length];
		for (int i = 0; i < num.length; i++) {
			y[i] = num[i];

		}
		return y;
	}
//Task 5
	public static int[] Shrink2 (int[] num1) {
		int[] y = new int[num1.length / 2];
		for (int i = 0; i < y.length; i++) {
			y[i] = num1[i];

		}
		return y;
	}
	//Task 6
	public static double[] grow(double[] num) {
		double[] x = new double[2 * num.length];
		for (int i = 0; i < num.length; i++) {
			x[i] = num[i];

		}
		return x;
	}
//Task 7
	public static double[] Shrink(double[] num1) {
		double[] x = new double[num1.length / 2];
		for (int i = 0; i < x.length; i++) {
			x[i] = num1[i];

		}
		return x;
	}
}
