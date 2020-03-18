public class BmiService {
    public double calculate (double weight, double height ){
        double indexMB = weight / (height*height);
        return indexMB;
    }
}
