//Calculator
class Calculator{
	int[] num;   //Declare num array
	
	public Calculator() {
		UserInput in = new UserInput();
		this.num = in.getTwoNumbers();
	}
	
	//Addition
	int addition() {
		return num[0] + num[1];
	}
	
	//Subtraction
	int subtraction() {
		return num[0] - num[1];
	}
	
	//Multiplication
	int multiplication() {
		return num[0] * num[1];
	}
	
	//Division
	double division() {
		if (num[1] == 0) {
			System.out.println("Division by zero is not allowed. Returning 0 as the result.");
			return 0;   //Return 0 or any default character
		}
		return (double) num[0] / num[1];
	}
	
	//Fibonacci Sequence
	void fibonacci (int n) {
		int a = 0, b = 1, sum;
		System.out.println("Fibonacci sequesnce: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println();
	}
	
	//Mean of array
	void mean(int[] array) {
		double sum = 0;
		for (int num: array) {
			sum += num;
		}
		System.out.println("Mean is: " + (sum / array.length));
	}
	
	//Variance of array
	void variance(int [] array) {
		double sum = 0;
		for (int num: array) {
			sum += num;
		}
		double mean = sum / array.length;
		double sumSquaredDiffs = 0;
		for (int num: array) {
			sumSquaredDiffs += Math.pow(num - mean, 2);
		}
		System.out.println("Variance is: " + (sumSquaredDiffs / array.length));
	}
}