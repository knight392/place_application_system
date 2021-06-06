package pojo;

import java.util.List;

/**
 * 申请流程类
 */
public class AplProcedure {

    private Integer pro_no;  // 流程编号
    private String pro_name; // 流程名
    private List<Place> places; // 包含场地
    private List<Position> positions; // 包含职位

    public Integer getPro_no() {
        return pro_no;
    }

    public void setPro_no(Integer pro_no) {
        this.pro_no = pro_no;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }


    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

}
