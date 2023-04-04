package Com.training;

import repositories.StudentDAO;

import java.sql.SQLException;

public class Main {
     public static void main(String[] args){
         StudentDAO stu=new StudentDAO();
         System.out.println(stu.getAll());
    }
}
