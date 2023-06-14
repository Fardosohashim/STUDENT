package STUDENT;

public class main {
    public static void main(String[] args) {

Student[] students=new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setInfo("Student " + (i + 1), 10 + i, "Address " + (i + 1));
        }

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Address: " + student.getAddress());
        }
    }
}