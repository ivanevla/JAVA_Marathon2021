package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student s = new Student("Bob", "C");
        Teacher t = new Teacher("Mary", "Math");

        System.out.println(s.getGroupName());
        System.out.println(t.getSubjectName());

        s.printInfo();
        t.printInfo();
    }
}
