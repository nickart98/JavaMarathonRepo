package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Андрей","ИВТ");
        Teacher teacher1 = new Teacher("Сергей","Мат.анализ");
        System.out.println(student1.getStudyGroup());
        System.out.println(teacher1.getSubject());
        student1.printInfo();
        teacher1.printInfo();
    }
}
