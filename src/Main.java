public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    float height=1.71F;
    float weight=72F;
    float index = service.calculate(height, weight);
    System.out.println("Ваш ИМТ = "+ index);
    }
}
