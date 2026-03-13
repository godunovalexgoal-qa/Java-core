public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.introduce();
    }

    public void introduce() {
        String firstName = "Nikolay";
        String lastName  = "Baskov";
        int age = 25;

        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");

        };
}

