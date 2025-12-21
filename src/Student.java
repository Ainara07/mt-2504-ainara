

public class Student extends Human {

    private String university;
    private float gpa;

    public Student(int age, String name, boolean isEmployed,
                   String university, float gpa) {
        super(age, name, isEmployed);
        this.university = university;
        this.gpa = gpa;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", University: " + university + ", GPA: " + gpa;
    }
    @Override
    public void introduce(){
        System.out.println("Hello, my name is "+ getName() + ", I am a student.");
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
