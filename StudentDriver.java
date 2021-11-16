public class StudentDriver
{
    public static void main(String[] args) {
        Student student1 = new Student(100, 80, 95);
        System.out.println("student1 ID: " + student1.getID());
        System.out.println("student1 avg grade: " + student1.avgGrade());
        System.out.println("student1 exam1 grade: " + student1.getGrade(1));
        System.out.println("student1 exam2 grade: " + student1.getGrade(2));
        System.out.println("student1 exam3 grade: " + student1.getGrade(3));

        Student student2 = new Student(60, 85, 0);
        System.out.println("\nstudent2 ID: " + student2.getID());
        student2.setID(13);
        System.out.println("student2 updated ID: " + student2.getID());
        System.out.println("student2 avg grade: " + student2.avgGrade());
        student2.setGrade(3, 90);
        System.out.println("student2 updated avg grade: " + student2.avgGrade());

        System.out.println("\nstudent with greatest avg grade: " + Student.greaterGrade(student1, student2).getID());

        System.out.println("\nstudent2 exam4 grade: " + student2.getGrade(4)); // This will return an error
    }
}