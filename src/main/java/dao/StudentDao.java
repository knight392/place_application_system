package dao;

import pojo.Student;

/**
 * 学生持久层操作
 */
public interface StudentDao {
    /**
     * 查询学生
     */
    public Student selectStudentByNo(String s_no);


    /**
     * 添加学生
     */
    public int insertStudent(Student student);
}
