import com.sun.corba.se.impl.oa.toa.TOA;

import javax.swing.*;
import java.awt.*;

public class Overseer
{
    List l = new List();
    Window w = new Window();
    String[] options = {"Remove", "Add", "Move", "Exit"};
    String[] yN = {"Yes", "No"};
    int click = 0;
    public Overseer()
    {
        int i = w.option(yN, "Do you have a list of names to add?");
        if(i == 0)
            l.oldList();
        while(click != 3)
        {
            click =  w.option(options, ToString());
            if(click == 0)
            {
                int r = Integer.parseInt(w.input("What row is the student located?"));
                int c = Integer.parseInt(w.input("What column is the student located?"));
                if(r < 6 && r > 0 && c < 6 && c > 0)
                    l.removeStudent(r,c);
                else
                    w.msg("There is no such position find another one!");
            }
            else if(click == 1)
            {
                int r = Integer.parseInt(w.input("What row do you want to locate the student?"));
                int c = Integer.parseInt(w.input("What column do you want to put the student?"));
                String fN = w.input("What is the students first name?");
                String lN = w.input("What is the students last name inital?");
                Student s = new Student(fN, lN);
                if(r < 6 && r > 0 && c < 6 && c > 0)
                    l.addStudent(s, r, c);
                else
                    w.msg("There is no such position find another one!");

            }
            else if(click == 2)
            {
                int r = Integer.parseInt(w.input("What row is the student located now?"));
                int c = Integer.parseInt(w.input("What column is the student located now?"));
                int r2 = Integer.parseInt(w.input("What row do you want to locate the student?"));
                int c2 = Integer.parseInt(w.input("What column do you want to locate the student?"));
                if(r < 6 && r > 0 && c < 6 && c > 0 && r2 < 6 && r2 > 0 && c2 < 6 && c2 > 0)
                {
                    String FN = l.getList()[r - 1][c - 1].getFirstName();
                    String LN = l.getList()[r - 1][c - 1].getLastName();
                    l.removeStudent(r, c);
                    Student s = new Student(FN, LN);
                    l.addStudent(s, r2, c2);
                }
                else
                    w.msg("There is no such position find another one!");

            }

        }
        System.exit(0);
    }

    public String ToString()
    {
        String sResult = "";
        for(int r = 0; r < 5; r++)
        {

            for(int c = 0; c < 5; c++)
            {
                sResult += "[ ";
                if(l.getList()[r][c] != null)
                {
                    sResult += l.getList()[r][c].getFirstName() + " ,";
                    sResult += l.getList()[r][c].getLastName() + " ";
                }
                else
                    sResult += " NONE ";
                sResult += " ]";
                sResult += "          ";
            }
            sResult += "\n";
        }
        return sResult;
    }

}