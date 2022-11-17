package Spring.Xml;

public interface Calculator {
	
	public void addFunction(MathFunction function);
	
	public void listMathFunction();
	
	public double doCalculation(String functionName, double arg);

	void setFunction(MathFunction[] mathFunctions);

}
