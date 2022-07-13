public class BmiService {

    public double calculate(double mass, double height) {
        double result;
        result = mass / (height * height);
        return result;
    }
}