public class BmiService {
    public double calculate (double cost) {
        double BmiServiceValue = cost / Math.pow (1.7, 2);
        return BmiServiceValue;
    }
}
