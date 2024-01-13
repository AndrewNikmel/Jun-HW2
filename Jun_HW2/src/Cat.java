public class Cat extends Animal{

    private boolean hypoAllergic; // гипоаллергенные свойства
    private boolean friendly; // дружелюбие

    public Cat(String name, int age, boolean hypoAllergic, boolean friendly) {
        super(name, age);
        this.hypoAllergic = hypoAllergic;
        this.friendly = friendly;
    }

    @Override
    public String toString() {
        return "\nКот: "                  + name +
                "\nВозраст: "             + age + " лет" +
                "\nГипоаллергенность: " + hypoAllergic +
                "\nДружелюбие: " + friendly;
    }


    public void makeSound() {                                                                       // Издает звуки.
        System.out.println("Голос: котик мяукает!");
    }

    public void showAffection() {                                                                   // Проявляет ласку.
        System.out.println("Котик мурлыкает и обтирается о Вашу ногу.");
    }

    public boolean isHypoAllergic() {
        return hypoAllergic;
    }

    public boolean isFriendly() {
        return friendly;
    }
}
