package Spring.Xml;

import org.springframework.stereotype.Component;

public class CubeFunction implements MathFunction {
	private static String name = "Cube";

	@Override
	public String getName() {

		return name;
	}

	@Override
	public double calculate(double arg) {

		return Math.pow(arg, 3);
	}

}
