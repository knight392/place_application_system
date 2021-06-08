package daoTest;

import dao.TeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Teacher;

/**
 * 教师测试
 */
public class TeacherDaoTest {
    /**
     * 添加教师
     */
    @Test
    public void insertTeacherTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherDao teacherDao = act.getBean(TeacherDao.class);
        Teacher teacher = new Teacher();
        teacher.setTeacher_no("123456");
        teacher.setTeacher_name("周先生");
        teacher.setTeacher_password("bac123456");
        teacherDao.insertTeacher(teacher);
    }

    /**
     * 修改教师
     */
    @Test
    public void updateTeacher() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherDao teacherDao = act.getBean(TeacherDao.class);
        Teacher teacher = new Teacher();
        teacher.setTeacher_no("123456");
        teacher.setTeacher_password("abc654321");
        teacherDao.updateTeacher(teacher);
    }


    /**
     * 删除教师
     */
    @Test
    public void deleteTeacherTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherDao teacherDao = act.getBean(TeacherDao.class);
        teacherDao.deleteTeacher("123456");
    }

    /**
     * 查询教师
     */
    @Test
    public void selectTeacherTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherDao teacherDao = act.getBean(TeacherDao.class);
        Teacher teacher = teacherDao.selectTeacherByNo("123456");
        if(teacher != null) {
            System.out.println(teacher);
        }
    }
}
