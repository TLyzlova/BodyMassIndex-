public class Main {
    public static void main(String[] args) {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        double index = bodyMassIndex.calculate(56.00,  1.65 * 1.65);
        System.out.println(index);
    }
}
