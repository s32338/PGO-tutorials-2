import java.util.ArrayList;

public class Student {
    public String fname;
    public String lname;

    public int indexNumber;

    public String email;

    public String address;

    public ArrayList<Integer> grades = new ArrayList<Integer>();

    public ArrayList<StudentGroup> groups = new ArrayList<StudentGroup>();

    public void addGrade(int grade) {
        if(grades.size() == 20) {
            throw new IllegalArgumentException("Student can have max 20 grades");
        }
        grades.add(grade);
    }

    public double getAvg() {
        if(grades.size() == 0) {
            throw new IllegalArgumentException("Student has no grades");
        }
        int sum = 0;
        for(int i=0; i<grades.size();i++) {
            sum += grades.get(i);
        }

        return Math.round(2*sum/grades.size()) / 2.0f;
    }
}
