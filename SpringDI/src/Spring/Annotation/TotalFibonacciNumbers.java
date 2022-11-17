package Spring.Annotation;

public class TotalFibonacciNumbers implements MathFunction {
	public static String name = "Fibonacci";
	public int sum = 0;

	@Override
	public String getName() {

		return name;
	}

	@Override
	public double calculate(double arg) {
		int[] assignmentFibonacci = new int[(int) arg + 1];
		assignmentFibonacci[0] = 0;
		assignmentFibonacci[1] = 1;

		int sum = 1;

		if (arg == 0 || arg == 1)
			return arg;
		for (int i = 2; i <= arg; i++) {
			assignmentFibonacci[i] = assignmentFibonacci[i - 1] + assignmentFibonacci[i - 2];
			System.out.print(assignmentFibonacci[i] + " "); // Print for loop fibonacci number
			sum += assignmentFibonacci[i];
		}

		return sum;
	}

}
