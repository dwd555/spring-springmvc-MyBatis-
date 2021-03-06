package com.dwd.pojo;

import java.io.Serializable;

public class BookUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_user.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_user.phone
     *
     * @mbg.generated
     */
    private Long phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_user.upwd
     *
     * @mbg.generated
     */
    private String upwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_user.uid
     *
     * @return the value of book_user.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_user.uid
     *
     * @param uid the value for book_user.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_user.phone
     *
     * @return the value of book_user.phone
     *
     * @mbg.generated
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_user.phone
     *
     * @param phone the value for book_user.phone
     *
     * @mbg.generated
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_user.upwd
     *
     * @return the value of book_user.upwd
     *
     * @mbg.generated
     */
    public String getUpwd() {
        return upwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_user.upwd
     *
     * @param upwd the value for book_user.upwd
     *
     * @mbg.generated
     */
    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_user
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BookUser other = (BookUser) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getUpwd() == null ? other.getUpwd() == null : this.getUpwd().equals(other.getUpwd()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_user
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getUpwd() == null) ? 0 : getUpwd().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", phone=").append(phone);
        sb.append(", upwd=").append(upwd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}