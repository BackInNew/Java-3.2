public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        int height = 180;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}