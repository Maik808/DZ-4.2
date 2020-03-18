
public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double weight = 72;
        double height = 1.70;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}
