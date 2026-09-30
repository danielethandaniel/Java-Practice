package Java_20260511_class.Javabean;

public class StudentService {
    int count = 0;
    Student[] students = new Student[10];

    public void addStudent(Student student) {


        students[count] = student;
        count++;

        System.out.println("添加学生成功");
    }

    public void listStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getName() + students[i].getAge() + students[i].getId());
        }

        System.out.println("列出所有学生成功");
    }
}
