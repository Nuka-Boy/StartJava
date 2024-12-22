public class Wolf {
    private String gender;
    private String nickName;
    private float weight;
    private int age;
    private String coloring;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        if (gender == "") {
            System.out.println("Пустая строка");
        } else {
            this.gender = gender;
        }
    }

    public String getNickName() {
        return nickName;
    }

    void setNickName(String nickName) {
        if (nickName == "") {
            System.out.println("Пустая строка");
        } else {
            this.nickName = nickName;
        }
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        if (weight < 0) {
            System.out.println("Некорректный вес");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColoring() {
        return coloring;
    }

    void setColoring(String coloring) {
        this.coloring = coloring;
    }
    
    public void walk() {
        System.out.println("Wolf идёт");
    }

    public void seat() {
        System.out.println("Wolf сидит");
    }

    public void run() {
        System.out.println("Wolf бежит");
    }

    public void howl() {
        System.out.println("Wolf воет");
    }

    public void hunt() {
        System.out.println("Wolf охотится");
    }
}