package org.example;

import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import resources.SpringConfig;
import student_rowMapper.StudentRowMapper;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {





        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);

////insertion operation
//        int roll_no=101;
//        String name="AHMED";
//        int mark =91;
//
//        String insert_sql_query="insert into student values(?,?,?)";
//      int count=  jdbcTemplate.update(insert_sql_query,roll_no,name, mark);
//
//      if(count>0){
//
//          System.out.println("data insert successfuly");
//      }else {
//          System.out.println("insertion fail");
//      }

//        //update operation
//        int roll_no=101;
//        int mark =81;
//        String update_sql_query="update student set mark=? where roll_no=?";
//
//      int count=  jdbcTemplate.update(update_sql_query,mark,roll_no);
//
//        if(count>0){
//
//          System.out.println("update successfuly");
//     }else {
//          System.out.println("updation fail");
//      }

//select operation

        String select_sql_query= "select *from student";

       List<Student> studentList = jdbcTemplate.query(select_sql_query,new StudentRowMapper());

for (Student std2 : studentList){

    System.out.println("roll no :"+std2.getRoll_no());
    System.out.println("name :"+std2.getName());
    System.out.println("mark :"+ std2.getMark());

    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
}

        }
    }
