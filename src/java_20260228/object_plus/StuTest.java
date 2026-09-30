package java_20260228.object_plus;

public class StuTest {
    public static void main(String[] args) {
       Stu li = new Stu("李明",23,"男");
       Stu liu = new Stu("刘瑶",22,"女");
       Stu s1 = new Stu();
        li.study();
        System.out.println(liu.name);
        s1.setAge(24);
        s1.setGender("男");
        s1.setName("hhh");
    }
}
