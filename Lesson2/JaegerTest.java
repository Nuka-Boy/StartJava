public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("CoyoteTango");

        jaegerOne.setModelName("Striker Eureka");
        jaegerOne.setMark("Mark - 5");
        jaegerOne.setOrigin("Australia");
        jaegerOne.setHeight(76.2);
        jaegerOne.setWeight(6.665);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(9);
        System.out.printf("Робот - 1 %s%n%s%n%s%n%s%n%s%n%s%n%s%n", jaegerOne.getModelName(),
                jaegerOne.getMark(), jaegerOne.getOrigin(), jaegerOne.getHeight(), jaegerOne.getWeight(), 
                jaegerOne.getStrength(), jaegerOne.getArmor());

        System.out.printf("%nРобот - 2 %s%n%s%n%s%n%s%n%s%n%s%n%s%n", jaegerTwo.getModelName(),
                jaegerTwo.getMark(), jaegerTwo.getOrigin(), jaegerTwo.getHeight(), jaegerTwo.getWeight(), 
                jaegerTwo.getStrength(), jaegerTwo.getArmor());
    }
}