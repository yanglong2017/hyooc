package com.hyooc.bean.aim;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "aim_user")
public class AimUser implements Serializable {
    @Id
    private String id;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 手机号
     */
    private Integer phone;

    /**
     * 微信
     */
    private String weixin;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 标签
     */
    private String label;

    /**
     * 账号
     */
    private String account;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 标志 0正常 1禁用 
     */
    private Boolean flag;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return name - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 获取微信
     *
     * @return weixin - 微信
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置微信
     *
     * @param weixin 微信
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取标志 0正常 1禁用 
     *
     * @return flag - 标志 0正常 1禁用 
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * 设置标志 0正常 1禁用 
     *
     * @param flag 标志 0正常 1禁用 
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}