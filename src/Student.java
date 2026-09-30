public class Student {
    String name;
    int age;
    double Chinese;
    double Math;

    public Student() {
    }

    public Student(String name, int age, double chinese, double math) {
        this.name = name;
        this.age = age;
        Chinese = chinese;
        Math = math;
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

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }
}
