public class Main {
    public static void main(String[] args) {
        Lecturer Le1 = new Lecturer();
        Le1.lec_fname = "Ewa";
        Le1.lec_lname = "Kwiatkowska";

        Lecturer Le2 = new Lecturer();
        Le2.lec_fname = "Tomasz";
        Le2.lec_lname = "Wieczorek";


        StudentGroup sg1 = new StudentGroup();
        sg1.nameGroup = "English";

        StudentGroup sg2 = new StudentGroup();
        sg2.nameGroup = "Mathematic";

        sg1.lecturer = Le1;
        sg2.lecturer = Le2;


        Student st1 = new Student();
        st1.fname = "Jan";
        st1.lname = "Kowalski";
        st1.indexNumber = 1312;
        st1.email = "1312@mail.com";
        st1.address = "street 12";


        for(int i = 0; i<20;i++) {
            st1.addGrade(4);
        }

        System.out.println("średnia studenta/ki "+st1.fname + " " +st1.lname+ " to: " + st1.getAvg());

        Student st2 = new Student();
        st2.fname = "Anna";
        st2.lname = "Nowak";
        st2.indexNumber = 1415;
        st2.email = "1415@mail.com";
        st2.address = "street 5";

        st2.addGrade(5);
        st2.addGrade(2);
        st2.addGrade(3);

        System.out.println("średnia studenta/ki "+st2.fname + " " +st2.lname+ " to: " + st2.getAvg());


        sg1.addStudent(st1);
        sg2.addStudent(st1);
        sg2.addStudent(st2);
    }
}