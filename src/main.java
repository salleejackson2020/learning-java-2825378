public class main {

    public static void main(String[] args) {
        Student studentA = new Student("Jackson","Sallee",2024,3.74,"Computer Science");
        Student studentB = new Student("John","Smith",2021,3,"Mathematics");

        System.out.println("Expected grad year after incrementing by one: " + studentB.incrementExpectedGradYear());
    }
}
