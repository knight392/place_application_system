package dao;

import pojo.AplProcedure;

import java.util.List;

/**
 * 场地申请流程持久层操作
 */
public interface AplProcedureDao {
    /**
     * 修改流程
     */
    public int updateAplProcedure(AplProcedure aplProcedure);

    /**
     * 添加流程
     */
    public int insertAplProcedure(AplProcedure aplProcedure);

    /**
     * 删除流程
     */
    public int deleteAplProcedure(Integer pro_no);

    /**
     * 查询所有的流程
     */
    public List<AplProcedure> selectAllAplProcedure();
}
