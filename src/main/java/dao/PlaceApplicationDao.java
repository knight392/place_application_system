package dao;

import pojo.AplProcedure;

/**
 * 申请表持久层操作
 */
public interface PlaceApplicationDao {
    /**
     * 添加申请表
     */
    public int insertPlaceApplication(AplProcedure aplProcedure);

    /**
     * 查询申请表
     */
    public AplProcedure selectPlaceApplication(Integer apl_no);

    /**
     * 修改申请表
     */
    public int updatePlaceApplication(AplProcedure aplProcedure);
}
