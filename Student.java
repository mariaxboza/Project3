public class Student { // Class to create the Student Object 

    private String FName;
    private String LName;

    public Student (String fName, String lName)
    { // Constuctor to create the Student with a first name and last name
        FName = fName;
        LName = lName;
    }

    public String getFirstName ()
    { // Method to get the students first name
        return FName;
    }

    public String getLastName()
    {   // Method to get the students last name
        return LName;
    }
}
