package Spring.Annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Spring")
public class Conf {
	@Bean()
	public CalculatorT1 calculatorT1() {
		final CalculatorT1 calculatorT1 = new CalculatorT1(4);
		MathFunction[] functions = {cubeFunction(), logFunction() ,sinFunction(), cosFunction() };
		calculatorT1.setFunctions(functions);
		return calculatorT1;
	}
	@Bean
	public MathFunction cubeFunction() {
		return new CubeFunction();
	}
	@Bean
	public MathFunction logFunction() {
		return new LogFunction();
	}
	@Bean
	public MathFunction sinFunction() {
		return new SinFunction();
	}

	@Bean
	public MathFunction cosFunction() {
		return new CosFunction();
	}
}
