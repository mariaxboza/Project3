import java.util.*;

public class List {// Class to create the list of students

    private Student[][] studentList;
    Window w = new Window();

    public List()
    {// Constuctor that creates the student arry of 5 by 5
       studentList = new Student[5][5];
    }

    public Student[][] getList()
    {// Method to get the student array
        return studentList;
    }

    public void addStudent(Student s, int r, int c)
    { // Method to add the student in the spot in which was asked for
        studentList[r-1][c-1] = s;
    }

    public void removeStudent(int r, int c)
    { // Method to remove the student in the place indecated
        studentList[r-1][c-1] = null;
    }

    public void oldList()
    {   // Method to create a list that has already been made
        int kids = Integer.parseInt(w.input("How many students are there? " +
                "\n Remeber that the number of kids can not be more than 25"));
        int cnt = 0;
        for(int c = 0; c < 5; c++)
        {
            for(int r = 0; r < 5; r++)
            {
                String FN = w.input("What is the students first name?");
                String LN = w.input("What is the students last name?");
                Student s = new Student (FN, LN);
                addStudent(s,(r+1),(c+1));
                cnt++;
                if(cnt == kids)
                {
                    r = 5;
                    c = 5;
                }
            }
        }



    }


}
