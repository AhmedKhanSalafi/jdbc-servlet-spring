package student_rowMapper;

import beans.Student;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>{


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student std = new Student();
        std.setRoll_no(rs.getInt("roll_no"));
       std.setName(rs.getString("name"));
        std.setMark(rs.getInt("mark"));


        return std;
    }
}

