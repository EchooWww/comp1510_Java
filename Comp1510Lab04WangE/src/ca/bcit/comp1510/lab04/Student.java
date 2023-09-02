package ca.bcit.comp1510.lab04;

/**
 * Student: used to represent a Student.
 * @author echo
 * @version 1.0
 */
public class Student {
    
    /** the student's first name. */
    private String firstName;
    
    /** the student's last name. */
    private String lastName;
    
    /** the student's year of birth. */
    private int yearOfBirth;
    
    /** the student's student number. */
    private String studentNumber;
    
    /** the student's GPA. */
    private int gpa;


    /**
     * The constructor of the public class Student.
     * @param string represents the first name.
     * @param string2 represents the last name.
     * @param i represents the year of birth.
     * @param string3 represents the student number.
     * @param j represents the gpa.
     */
    public Student(String string, String string2, 
            int i, String string3, int j) {
        firstName = string;
        lastName = string2;
        yearOfBirth = i;
        studentNumber = string3;
        gpa = j;
    }



    /**
     * return a string with the information concatenated.
     * @return the concatenation.
     */
    public String toString() {
        return firstName + " " + lastName + " " + yearOfBirth + " "
                + studentNumber + " " + gpa;
    }


    /**
     * the accessor of firstname.
     * @return firstName of the student
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * the accessor of lastname.
     * @return lastName of the student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * the accessor of birthyear.
     * @return yearOfBirth of the student.
     */
    public int getBirthYear() {
        return yearOfBirth;
    }


    /**
     * the accessor of student number.
     * @return studentNumber of the student.
     */
    public String getStudentNumber() {
        return studentNumber;
    }


    /**
     * the accessor of grade average.
     * @return gpa of the student.
     */

    public int getGradeAverage() {
        return gpa;
    }


    /**
     * the mutator of firstName.
     * @param string means the input for firstName
     */
    public void setFirstName(String string) {
        firstName = string;
    }


    /**
     * the mutator of yearOfBirth.
     * @param i means the input for yearOfBirth
     */
    public void setBirthYear(int i) {
        yearOfBirth = i;
    }


    /**
     * the mutator of studentNumber.
     * @param string2 means the input for studentNumber
     */
    public void setStudentNumber(String string2) {
        studentNumber = string2;
    }



    /**
     * the mutator of firstName.
     * @param string3 means the input for firstName
     */
    public void setLastName(String string3) {
        lastName = string3;
    }

    /**
     * the mutator of gpa.
     * @param j means the input for gpa
     */
    public void setGradeAverage(int j) {
        gpa = j;
    }


}
