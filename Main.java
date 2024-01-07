import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        println("Write the temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        scanner.nextLine();

        println("Choose the type of temperature (fahrenheit, kelvin): ");
        String type = scanner.nextLine();
        String fahrenheit = "fahrenheit";
        String kelvin = "kelvin";

            if (type.equals(fahrenheit)){
                double fahrenheitTemp = ((temperature * 9/5) + 32);
                println("The temperature in fahrenheit is: "+fahrenheitTemp);
            }
                if (type.equals(kelvin)){

                    if(temperature < (-273.15)){
                    println("There is no negative kelvin");

                    } else {

                    double kelvinTemp = (temperature + 273.15);
                    println("The temperature in kelvin is: "+kelvinTemp);
                    }
            }
    }
    public static void println(String str) {
        System.out.println(str);
    }
}