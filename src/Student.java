public class Student {
    String firstName;
    String lastName;
    int expectedGradYear;
    double GPA;
    String declaredMajor;

    public Student(String firstName, String lastName,
                   int expectedGradYear, double GPA,
                   String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGradYear = expectedGradYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public int incrementExpectedGradYear() {
        this.expectedGradYear = this.expectedGradYear + 1;
        return this.expectedGradYear;
    }

}
