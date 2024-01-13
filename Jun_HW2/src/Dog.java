public class Dog extends Animal{

    private boolean dangerous; // опасна для чужих.
    private boolean wearsCollar; // наличие ошейника в публичных местах

    public Dog(String name, int age, boolean dangerous, boolean wearsCollar) {
        super(name, age);
        this.dangerous = dangerous;
        this.wearsCollar = wearsCollar;
    }

    @Override
    public String toString() {
        return "\nСобака: " + name +
                "\nВозраст: " + age + " лет" +
                "\nДрессировка: " + dangerous +
                "\nНаграды: " + wearsCollar;
    }

    public void makeSound() {
        System.out.println("Голос: собака лает!");                                  // Издает звуки.
    }


    public void showAffection() {                                                   // Проявляет ласку.
        System.out.println("Собака машет хвостом.");
    }

    public void training() {                                                        // Собака готова к дрессировке
        System.out.println("Собака выполнила команду сидеть и ждет дальнейших указаний.");
    }
}