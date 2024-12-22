public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setNickName("");
        wolfOne.setWeight(32.5f);
        wolfOne.setAge(5);
        wolfOne.setColoring("Серый");
        wolfOne.setGender("Мужской");
        System.out.println("Пол волка - " + wolfOne.getGender());
        System.out.println("Кличка волка - " + wolfOne.getNickName());
        System.out.println("Вес волка в кг - " + wolfOne.getWeight());
        System.out.println("Кол-во лет волка - " + wolfOne.getAge());
        System.out.println("Окраска волка - " + wolfOne.getColoring());
        wolfOne.walk();
        wolfOne.seat();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}