package Names;

public class Main {
    public static void main(String[] args) {
        // Test af klassen
        Names name1 = new Names("John");
        Names name2 = new Names("John Smith");
        Names name3 = new Names("John Mary Smith");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
