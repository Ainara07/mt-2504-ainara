

public final class Student extends Human implements IStudyable {

    private String university;
    private float gpa;

    private final String studentType= "Regular";


    public Student(int age, String name, boolean isEmployed,
                   String university, float gpa) {
        super(age, name, isEmployed);
        this.university = university;
        this.gpa = gpa;
    }
    public final String getStudentType() {
        return studentType;
    }

    @Override
    public void study(){
        System.out.println(name + " is studying in " + university);
    }

    @Override
    public double calculateGPA() {
        return 3.5;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", University: " + university + ", GPA: " + gpa;
    }
    @Override
    public void introduce(){
        System.out.println("Hello, my name is "+ getName() + ", I am a student.");
    }

    @Override
    public void showInfo() {
        System.out.println("Student name: " +name+ ", age: "+age+", University: " + university + ", gpa:" + gpa );
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
