public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.nickName = "Барон";
        wolfOne.weight = 32.5f;
        wolfOne.age = 5;
        wolfOne.coloring = "Серый";
        System.out.println("Пол волка - " + wolfOne.gender);
        System.out.println("Кличка волка - " + wolfOne.nickName);
        System.out.println("Вес волка в кг - " + wolfOne.weight);
        System.out.println("Кол-во лет волка - " + wolfOne.age);
        System.out.println("Окраска волка - " + wolfOne.coloring);
        wolfOne.walk();
        wolfOne.seat();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}