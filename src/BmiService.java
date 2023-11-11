public class BmiService {
    public int calculate(double heightInMeters, double weightInKg) {
        double indexBmi = weightInKg / (heightInMeters * heightInMeters);
        return (int) indexBmi;
    }
}
