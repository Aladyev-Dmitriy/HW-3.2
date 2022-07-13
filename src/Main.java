public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 70;
        int height = 180;
        double bodyMassIndex = service.calculate(mass, height);
        System.out.println("Индекс массы тела = " + bodyMassIndex);
    }
}