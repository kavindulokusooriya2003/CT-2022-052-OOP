package question_02;

public class Temperature {

    private double celsius;


    public Temperature() {
        celsius = 0;
    }


    public void setFahrenheit(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }


    public double toCelsius() {
        return celsius;
    }
}
