class Student {
    private String usn;
    private String name;

    Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    void display() {
        System.out.println("USN: " + usn + " | Name: " + name);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("1BM24CS001", "Ravi Kumar");
        Student s2 = new Student("1BM24CS002", "Anita Rao");
        Student s3 = new Student("1BM24CS003", "Koushik");

        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();
        System.out.println("\nKoushik kalyan N\n1WN25CS112");
    }
}
