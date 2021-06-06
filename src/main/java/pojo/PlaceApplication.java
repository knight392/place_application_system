package pojo;

import java.util.Date;

/**
 * 场地申请表
 */
public class PlaceApplication {

    private Integer apl_no; // 申请表编号
    private AplProcedure aplProcedure; // 所属流程
    private Student student; // 申请学生
    private int cur_status; // 当前申请状态 1 - 申请中 2 – 通过 3 – 打回 4 – 失败
    private int cur_step; // 当前在流程中的步骤 起始为1
    private String s_phone; // 联系电话
    private String tutor_name; // 导师姓名
    private String org_name; // 组织名称，申请一定要以组织名义申请
    private Date begin_time; // 开始时间
    private Date end_time; // 结束时间

    public Integer getApl_no() {
        return apl_no;
    }

    public void setApl_no(Integer apl_no) {
        this.apl_no = apl_no;
    }

    public AplProcedure getAplProcedure() {
        return aplProcedure;
    }

    public void setAplProcedure(AplProcedure aplProcedure) {
        this.aplProcedure = aplProcedure;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCur_status() {
        return cur_status;
    }

    public void setCur_status(int cur_status) {
        this.cur_status = cur_status;
    }

    public int getCur_step() {
        return cur_step;
    }

    public void setCur_step(int cur_step) {
        this.cur_step = cur_step;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    public String getTutor_name() {
        return tutor_name;
    }

    public void setTutor_name(String tutor_name) {
        this.tutor_name = tutor_name;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}
