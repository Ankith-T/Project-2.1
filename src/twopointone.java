import java.util.Scanner;
public class twopointone {
    public static void main(String[] args) throws Exception {
        // Initializing Scanner
        Scanner celsiusInput = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        float celsiusTemperature = celsiusInput.nextFloat();
        double fahrenheitValue = (celsiusTemperature * 9.0/5) + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsiusTemperature, fahrenheitValue);
        System.out.println("Converted Fahrenheit value: " + fahrenheitValue);   
        celsiusInput.close();

        
    }
}
