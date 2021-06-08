package daoTest;

import dao.AdminDao;
import dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

/**
 * 学生测试
 */
public class StudentDaoTest {
    /**
     * 添加学生
     */
    @Test
    public void insertDao() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = act.getBean(StudentDao.class);
        Student student = new Student();
        student.setS_no("191543214");
        student.setS_name("冯远安");
        student.setS_password("123456");
        student.setS_dwmc("互联网金融与信息工程学院");
        studentDao.insertStudent(student);
    }

    /**
     * 查询学生
     */
    @Test
    public void selectStudentTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao studentDao = act.getBean(StudentDao.class);
        Student student = studentDao.selectStudentByNo("191543214");
        if (student != null) {
            System.out.println(student);
        }
    }
}
