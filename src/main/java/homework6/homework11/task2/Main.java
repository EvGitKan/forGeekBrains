package homework6.homework11.task2;

public class Main {
    public static void main(String[] args) {
        phoneDirectory();
    }

    private static void phoneDirectory() {
        Directory directory = new Directory();

        directory.add("popov", "8911123321");
        directory.add("ivanov", "8911234567");
        directory.add("ivanov", "8934534534");
        directory.add("popov", "8934343434");
        directory.add("popov", "899999999");
        directory.add("kanaev", "899888888");
        directory.add("ivanov", "8911111111");
        directory.add("vasilev", "8812121212");
        directory.add("kanaev", "8777777777");

        System.out.println(directory.get("popov"));
        System.out.println(directory.get("kanaev"));
        System.out.println(directory.get("ivanov"));
        System.out.println(directory.get("vasilev"));
    }
}