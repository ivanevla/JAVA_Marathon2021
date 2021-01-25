package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int evaluation = random.nextInt(4) + 2;

        String evaluationText;
        switch (evaluation) {
            case 2:
                evaluationText = "неудовлетворительно";
                break;
            case 3:
                evaluationText = "удовлетворительно";
                break;
            case 4:
                evaluationText = "хорошо";
                break;
            case 5:
                evaluationText = "отлично";
                break;
            default:
                evaluationText = "";
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s",
                this.name, student.getName(), this.subject, evaluationText);
    }
}
