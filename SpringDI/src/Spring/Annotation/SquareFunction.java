package Spring.Annotation;

public class SquareFunction implements MathFunction{
	public static String name = "Square";
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public double calculate(double arg) {
		
		return Math.pow(arg, 2);
	}

}
