public class Student {

    private String FName;
    private String LName;

    public Student (String fName, String lName)
    {
        FName = fName;
        LName = lName;
    }

    public String getFirstName ()
    {
        return FName;
    }

    public String getLastName()
    {
        return LName;
    }
}
