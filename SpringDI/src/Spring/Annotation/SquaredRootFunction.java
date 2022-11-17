package Spring.Annotation;

public class SquaredRootFunction implements MathFunction{
	
	private static String name = "SquaredRoot";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg1) {
		return Math.sqrt(arg1);
	}
}
