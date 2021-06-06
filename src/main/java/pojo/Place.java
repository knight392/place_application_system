package pojo;

/**
 * 场地
 */
public class Place {
    private Integer place_no; // 场地编号
    private String place_name; // 场地名称
    private Integer pro_no; // 所属流程

    public Integer getPro_no() {
        return pro_no;
    }

    public void setPro_no(Integer pro_no) {
        this.pro_no = pro_no;
    }

    public Integer getPlace_no() {
        return place_no;
    }

    public void setPlace_no(Integer place_no) {
        this.place_no = place_no;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

}
