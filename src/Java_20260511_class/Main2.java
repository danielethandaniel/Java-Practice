package Java_20260511_class;

public class Main2 {

    public static void main(String[] args) {
        Project apple = new Project(1, "苹果", 5.5);
        Project bnanana = new Project(2, "香蕉", 3.2);

        System.out.println(apple.getId() + apple.getName() + apple.getPrice());
        System.out.println(bnanana.getId() + bnanana.getName() + bnanana.getPrice());
    }
}
