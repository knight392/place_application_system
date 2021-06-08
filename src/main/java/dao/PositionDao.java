package dao;

import pojo.Position;

import java.util.List;

/**
 * 职位持久层操作
 */
public interface PositionDao {
    /**
     * 添加职位
     */
    public int insertPosition(Position position);

    /**
     * 删除职位
     */
    public int deletePosition(Integer position_no);

    /**
     * 更新职位
     */
    public int updatePosition(Position position);

    /**
     * 查询所有职位
     */
    public List<Position> selectAllPositions();
}
