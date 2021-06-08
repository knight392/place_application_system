package daoTest;

import dao.PositionDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Position;

/**
 * 职位测试
 */
public class PositionDaoTest {
    /**
     * 添加职位
     */
    @Test
    public void insertPosition() {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        PositionDao positionDao = act.getBean(PositionDao.class);
        Position position = new Position();
        position.setPosition_no(1);
        position.setPosition_name("北教申请1");
        position.setPosition_info("负责北教申请第一位审批");
        positionDao.insertPosition(position);
    }

    /**
     * 修改职位
     */

    /**
     * 查询职位
     */

    /**
     * 删除职位
     */
}
