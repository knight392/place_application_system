package dao;

import pojo.Place;

/**
 * 场地持久层操作
 */
public interface PlaceDao {
    /**
     * 添加场地
     */
    public int insertPlace(Place place);

    /**
     * 删除场地
     */
    public int deletePlace(Integer place_no);

    /**
     * 修改场地信息
     */
    public int updatePlace(Place place);
}
