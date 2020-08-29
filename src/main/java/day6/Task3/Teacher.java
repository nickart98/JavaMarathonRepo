package day6.Task3;

import java.util.Random;

public class Teacher {
    private String fullName, subject;

    public Teacher(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    void toRateAStudent(Student student){
        Random rd = new Random();
        int value = rd.nextInt(4) +2;
        String valueStr = null;
        switch (value){
            case 2:
                valueStr = "Неудовлетворительно";
                break;
            case 3:
                valueStr = "Удовлетворительно";
                break;
            case 4:
                valueStr = "Хорошо";
                break;
            case 5:
                valueStr = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + fullName + " оценил студента " + student.getFullName() + " по предмету " + subject + " на оценку " + valueStr);
    }
}
