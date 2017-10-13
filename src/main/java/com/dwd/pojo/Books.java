package com.dwd.pojo;

import java.io.Serializable;

public class Books implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.bid
     *
     * @mbg.generated
     */
    private Integer bid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.img_sm
     *
     * @mbg.generated
     */
    private String imgSm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.img_lg
     *
     * @mbg.generated
     */
    private String imgLg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.author
     *
     * @mbg.generated
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.publish
     *
     * @mbg.generated
     */
    private String publish;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.star
     *
     * @mbg.generated
     */
    private Integer star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.comment
     *
     * @mbg.generated
     */
    private Integer comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.newprice
     *
     * @mbg.generated
     */
    private Float newprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.oldprice
     *
     * @mbg.generated
     */
    private Float oldprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.introduction
     *
     * @mbg.generated
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table books
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.bid
     *
     * @return the value of books.bid
     *
     * @mbg.generated
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.bid
     *
     * @param bid the value for books.bid
     *
     * @mbg.generated
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.name
     *
     * @return the value of books.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.name
     *
     * @param name the value for books.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.img_sm
     *
     * @return the value of books.img_sm
     *
     * @mbg.generated
     */
    public String getImgSm() {
        return imgSm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.img_sm
     *
     * @param imgSm the value for books.img_sm
     *
     * @mbg.generated
     */
    public void setImgSm(String imgSm) {
        this.imgSm = imgSm == null ? null : imgSm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.img_lg
     *
     * @return the value of books.img_lg
     *
     * @mbg.generated
     */
    public String getImgLg() {
        return imgLg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.img_lg
     *
     * @param imgLg the value for books.img_lg
     *
     * @mbg.generated
     */
    public void setImgLg(String imgLg) {
        this.imgLg = imgLg == null ? null : imgLg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.author
     *
     * @return the value of books.author
     *
     * @mbg.generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.author
     *
     * @param author the value for books.author
     *
     * @mbg.generated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.publish
     *
     * @return the value of books.publish
     *
     * @mbg.generated
     */
    public String getPublish() {
        return publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.publish
     *
     * @param publish the value for books.publish
     *
     * @mbg.generated
     */
    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.star
     *
     * @return the value of books.star
     *
     * @mbg.generated
     */
    public Integer getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.star
     *
     * @param star the value for books.star
     *
     * @mbg.generated
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.comment
     *
     * @return the value of books.comment
     *
     * @mbg.generated
     */
    public Integer getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.comment
     *
     * @param comment the value for books.comment
     *
     * @mbg.generated
     */
    public void setComment(Integer comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.newprice
     *
     * @return the value of books.newprice
     *
     * @mbg.generated
     */
    public Float getNewprice() {
        return newprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.newprice
     *
     * @param newprice the value for books.newprice
     *
     * @mbg.generated
     */
    public void setNewprice(Float newprice) {
        this.newprice = newprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.oldprice
     *
     * @return the value of books.oldprice
     *
     * @mbg.generated
     */
    public Float getOldprice() {
        return oldprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.oldprice
     *
     * @param oldprice the value for books.oldprice
     *
     * @mbg.generated
     */
    public void setOldprice(Float oldprice) {
        this.oldprice = oldprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column books.introduction
     *
     * @return the value of books.introduction
     *
     * @mbg.generated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column books.introduction
     *
     * @param introduction the value for books.introduction
     *
     * @mbg.generated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
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
        Books other = (Books) that;
        return (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImgSm() == null ? other.getImgSm() == null : this.getImgSm().equals(other.getImgSm()))
            && (this.getImgLg() == null ? other.getImgLg() == null : this.getImgLg().equals(other.getImgLg()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getPublish() == null ? other.getPublish() == null : this.getPublish().equals(other.getPublish()))
            && (this.getStar() == null ? other.getStar() == null : this.getStar().equals(other.getStar()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getNewprice() == null ? other.getNewprice() == null : this.getNewprice().equals(other.getNewprice()))
            && (this.getOldprice() == null ? other.getOldprice() == null : this.getOldprice().equals(other.getOldprice()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImgSm() == null) ? 0 : getImgSm().hashCode());
        result = prime * result + ((getImgLg() == null) ? 0 : getImgLg().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getPublish() == null) ? 0 : getPublish().hashCode());
        result = prime * result + ((getStar() == null) ? 0 : getStar().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getNewprice() == null) ? 0 : getNewprice().hashCode());
        result = prime * result + ((getOldprice() == null) ? 0 : getOldprice().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table books
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", name=").append(name);
        sb.append(", imgSm=").append(imgSm);
        sb.append(", imgLg=").append(imgLg);
        sb.append(", author=").append(author);
        sb.append(", publish=").append(publish);
        sb.append(", star=").append(star);
        sb.append(", comment=").append(comment);
        sb.append(", newprice=").append(newprice);
        sb.append(", oldprice=").append(oldprice);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}