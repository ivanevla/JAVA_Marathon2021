package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        Teacher teacher = new Teacher("Mary", "Math");
        teacher.evaluate(student);
    }
}
