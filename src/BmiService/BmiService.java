public class BmiService {
    public int calculate(double wei, double hi) {
        double bmi = wei / (hi * hi);
        return (int) bmi; // Преобразуем в целое число
    }
}
