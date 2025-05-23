public class Person {
    int p_id;
    String name;
    int age;

    public Person(int p_id, String name, int age) {
        this.p_id = p_id;
        this.name = name;
        this.age = age;
    }

    public void showPersonalInfo() {
        System.out.println("ID: " + p_id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
