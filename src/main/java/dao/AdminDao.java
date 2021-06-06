package dao;

import pojo.Admin;

/**
 * 管理员持久层操作
 */
public interface AdminDao {

    /**
     * 添加管理员
     */
    public int insertAdmin(Admin admin);

    /**
     * 根据账号查找管理员
     */
    public Admin selectAdminByNo(String admin_no);

    /**
     * 更新管理员
     */
    public int updateAdmin(Admin admin);

    /**
     * 删除管理员
     */
    public int deleteAdmin(String admin_no);
}
