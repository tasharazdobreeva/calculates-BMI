public class BmiService {
    public int calculate(double kg, double m) {

        int x = (int) (kg / (m * m));

        return x;
    }

}


