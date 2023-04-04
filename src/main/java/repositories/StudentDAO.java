package repositories;
import entities.Student;
import util.DBCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {

         ResultSet r;
         Student st;
    ArrayList<Student> slist = new ArrayList<Student>();
         public  ArrayList<Student>getAll(){



             try {
                 Statement stm = DBCon.getConnection().createStatement();
                 r = stm.executeQuery("select * from student");
                 while (r.next())
                   {
                     int idStudent = r.getInt(1);
                     String sname = r.getString(2);
                     String email = r.getString(3);
                     int  phone_number = r.getInt(4);
                     st = new Student();
                     st.setIdStudent(idStudent);
                     st.setSname(sname);
                     st.setEmail(email);
                    st.setPhone_number(phone_number);
                     slist.add(st);
                     }
             }     catch(SQLException e)
                 {
                     throw new RuntimeException(e);
                 }
                 return slist;
            }
}
