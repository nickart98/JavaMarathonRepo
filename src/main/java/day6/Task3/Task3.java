package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов Иван Иванович", "Математика");
        Student student1 = new Student("Петров Петр Петрович");
        teacher1.toRateAStudent(student1);
    }
}
