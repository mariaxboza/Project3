import java.util.*;

public class List {

    private Student[][] studentList;
    Window w = new Window();

    public List()
    {
       studentList = new Student[5][5];
    }

    public Student[][] getList()
    {
        return studentList;
    }

    public void addStudent(Student s, int r, int c)
    {
        studentList[r-1][c-1] = s;
    }

    public void removeStudent(int r, int c)
    {
        studentList[r-1][c-1] = null;
    }

    public void oldList()
    {
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
