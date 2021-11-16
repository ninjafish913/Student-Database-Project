public class Student
{
    private static int students;

    private int ID;
    private double exam1, exam2, exam3;

    public Student()
    {
        students++;
        this.ID = students;
    }

    public Student(double exam1Grade, double exam2Grade, double exam3Grade)
    {
        this();
        if (exam1Grade < 0 || exam1Grade > 100 || exam2Grade < 0 || exam2Grade > 100 || exam3Grade < 0 || exam3Grade > 100)
        {
            throw new IllegalArgumentException("Grades must be between 0 and 100");
        }
        this.exam1 = exam1Grade;
        this.exam2 = exam2Grade;
        this.exam3 = exam3Grade;
    }

    public double getGrade(int exam)
    {
        switch (exam) 
        {
            case 1:
                return this.exam1;
            case 2:
                return this.exam2;
            case 3:
                return this.exam3;
            default:
                throw new IllegalArgumentException("Unknown exam" + exam);
        }
    }

    public void setGrade(int exam, double grade)
    {
        if (grade < 0 || grade > 100)
        {
            throw new IllegalArgumentException("Grades must be between 0 and 100");
        }
        switch (exam) 
        {
            case 1:
                this.exam1 = grade;
                break;
            case 2:
                this.exam2 = grade;
                break;
            case 3:
                this.exam3 = grade;
                break;
            default:
                throw new IllegalArgumentException("Unknown exam" + exam);
        }
    }

    public int getID()
    {
        return this.ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public double avgGrade()
    {
        return (exam1 + exam2 + exam3) / 3;
    }

    public static Student greaterGrade(Student student1, Student student2)
    {
        if (student1.avgGrade() > student2.avgGrade())
        {
            return student1;
        } else {
            return student2;
        }
    }
}