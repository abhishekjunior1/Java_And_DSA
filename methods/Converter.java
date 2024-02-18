public class Converter {
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
    
    public double convert(double distance, String unit) {
        if (unit.equals("km"))
            return distance * 0.621371;
        else if (unit.equals("mi"))
            return distance * 1.60934;
        else
            return -1; // Invalid unit
    }
    
    public static void main(String[] args) {
        Converter obj = new Converter();
        
        double fahrenheit = obj.convert(25.0);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        double miles = obj.convert(10.0, "km");
        System.out.println("Distance in Miles: " + miles);
    }
}
