package daoTest;

import dao.AdminDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Admin;

/**
 * 管理员测试
 */
class AdminTest {
    /**
     * 添加管理员测试
     */
    @Test
    public void insertAdminTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDao adminDao = act.getBean(AdminDao.class);
        Admin admin = new Admin();
        admin.setAdmin_no("123456789");
        admin.setAdmin_name("小明");
        admin.setAdmin_password("abc123456");
        adminDao.insertAdmin(admin);
    }

    /**
     * 修改管理员信息测试
     */
    @Test
    public void updateAdminTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDao adminDao = act.getBean(AdminDao.class);
        Admin admin = new Admin();
        admin.setAdmin_no("123456789");
        admin.setAdmin_password("bca1234");
        adminDao.updateAdmin(admin);
    }

    /**
     * 删除管理员测试
     */
    @Test
    public void deleteAdminTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDao adminDao = act.getBean(AdminDao.class);
        adminDao.deleteAdmin("123456789");
    }

    /**
     * 查询管理员测试
     */

    @Test
    public void selectAdminTest() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDao adminDao = act.getBean(AdminDao.class);
        Admin admin = adminDao.selectAdminByNo("123456789");
        if (admin != null) {
            System.out.println(admin);
        }
    }
}
