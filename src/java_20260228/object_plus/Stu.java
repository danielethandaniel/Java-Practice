package java_20260228.object_plus;

public class Stu {
    String name;
    int age;
    String gender;

    public Stu() {
    }

    public Stu(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name+"年龄"+age+"性别"+gender+"正在学习");
    }
}
