import java.util.ArrayList;

public class StudentGroup {
    public String nameGroup;

    public Lecturer lecturer;

    public ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student newStudent) {
        checkMaxAmountOfStudents();
        for (int i=0; i<students.size(); i++) {
            Student x = students.get(i);
            if(x.indexNumber == newStudent.indexNumber) {
                throw new IllegalStateException("Student already added");
            }
        }
        students.add(newStudent);
    }
    public void checkMaxAmountOfStudents(){
        if (students.size() >= 15){
            throw new  IllegalStateException("The maximal amount of students in a group is 15");
        }
    }
}
