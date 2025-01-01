public class Cat {
    private String name; // Имя кота
    private int age;     // Возраст кота

    // Конструктор без параметров
    public Cat() {
    }

    // Конструктор с параметрами
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Переопределение метода toString() для удобного вывода
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}