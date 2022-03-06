class Student {
    private int enrollmentNo;
    private String name;
    private String gender;

    public Student() {
        enrollmentNo = 0;
        name = "undefine";
        gender = "female";
    }

    public Student(int en, String nm, String gn) {
        setEnrollmentNo(en);
        setName(nm);
        setGender(gn);
    }

    /* enrollmentNo */
    public int getEnrollmentNo() {
        return (enrollmentNo);
    }

    public void setEnrollmentNo(int en) {
        enrollmentNo = en;
    }

    /* name */
    public String getName() {
        return (name);
    }

    public void setName(String nm) {
        name = nm.toUpperCase();
    }

    /* gender */
    public String getGender() {
        return (gender);
    }

    public void setGender(String gn) {
        gender = gn.toUpperCase();
    }

    public void displayStudent() {
        System.out.println("***********************");
        System.out.println("Enrollment No : " + getEnrollmentNo());
        System.out.println("Student Name  : " + getName());
        System.out.println("Gender        : " + getGender());
        System.out.println("***********************");
    }
}

public class p4 {
    public static void main(String args[]) {
        Student s = new Student();
        s.displayStudent();
        Student s1 = new Student(45, "priyanka", "female");
        s1.displayStudent();

    }
}