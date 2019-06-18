package com.ln.Entity;

/**
 * Created by lining on 2019/6/18.
 */
public class Member {
    private int id;
    private String name;
    private String mobile;
    private String memberCode;

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "会员编号：" + memberCode + "，会员姓名：" + name + "，会员手机号：" + mobile;
    }
}
