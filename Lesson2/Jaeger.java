public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int strength;
    private int armor;
    
    public Jaeger() {
    }

    public Jaeger(String modelName) {
        this.modelName = modelName;

        if (modelName.equals("CoyoteTango")) {
            mark = "Mark - 1";
            origin = "Japan";
            height = 85.34;
            weight = 2.312;
            strength = 7;
            armor = 4;
        } else {
            this.modelName = "";
        }
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }
}