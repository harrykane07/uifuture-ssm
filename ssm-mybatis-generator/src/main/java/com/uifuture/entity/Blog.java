package com.uifuture.entity;

public class Blog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.id
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.title
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.author_id
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    private Integer authorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.id
     *
     * @return the value of blog.id
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.id
     *
     * @param id the value for blog.id
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.title
     *
     * @return the value of blog.title
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.title
     *
     * @param title the value for blog.title
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.author_id
     *
     * @return the value of blog.author_id
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.author_id
     *
     * @param authorId the value for blog.author_id
     *
     * @mbg.generated Tue Dec 04 19:20:23 CST 2018
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}