package ch6;

public class Ch6_8 {

	public static void main(String[] args) {
		

		System.out.println("Celsius\t\tFahrenheit\t|\t\tFahrenheit\tCelsius");
		
		for(double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0 && fahrenheit >= 30; celsius--, fahrenheit = fahrenheit-10.0) {
			System.out.printf("%s\t\t%.1f\t\t|\t\t%s\t\t%.1f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, FahrebheitToCelsius(fahrenheit));
		}

	}
	
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	
	public static double FahrebheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
