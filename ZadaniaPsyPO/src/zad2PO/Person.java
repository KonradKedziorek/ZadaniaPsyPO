package zad2PO;

public class Person {

    String name;
    String lastname;
    int age;
    float effectiveness;

    public Person(String name, String lastname, int age, float effectiveness) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.effectiveness = effectiveness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(float effectiveness) {
        this.effectiveness = effectiveness;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", effectiveness=" + effectiveness +
                '}';
    }
}

