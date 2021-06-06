package dao;

import pojo.Teacher;

/**
 * 教师持久层操作
 */
public interface TeacherDao {
    /**
     * 添加教师
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 根据账号查找教师
     */
    public Teacher selectTeacherByNo(String teacher_no);

    /**
     * 删除教师
     */
    public int deleteTeacher(String teacher_no);

    /**
     * 修改教师
     */
    public int updateTeacher(Teacher teacher);
}
