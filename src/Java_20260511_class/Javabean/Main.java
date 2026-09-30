package Java_20260511_class.Javabean;

public class Main {
/*    1 张三 18
            2 李四 20
            3 王五 -5*/

    public static void main(String[] args) {
        StudentService student = new StudentService();


        Student s1 = new Student(1, "张三", 18);
        Student s2 = new Student(2, "李四", 20);
        Student s3 = new Student(3, "王五", -5);

        student.addStudent(s1);
        student.addStudent(s2);
        student.addStudent(s3);

        student.listStudents();

    }
}
