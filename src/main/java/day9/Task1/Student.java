package day9.Task1;

public class Student extends Human {
    private String studyGroup;

    public Student(String name, String studyGroup) {
        super(name);
        this.studyGroup = studyGroup;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }
     public void printInfo(){
        super.printInfo();
         System.out.println("Этот студент с именем " + super.getName());
     }
}
