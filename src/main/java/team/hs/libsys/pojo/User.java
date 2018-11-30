package team.hs.libsys.pojo;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_unit
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private String userUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_surplus
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private Integer userSurplus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_address
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private String userAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    private String userPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_unit
     *
     * @return the value of user.user_unit
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public String getUserUnit() {
        return userUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_unit
     *
     * @param userUnit the value for user.user_unit
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit == null ? null : userUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_surplus
     *
     * @return the value of user.user_surplus
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public Integer getUserSurplus() {
        return userSurplus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_surplus
     *
     * @param userSurplus the value for user.user_surplus
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setUserSurplus(Integer userSurplus) {
        this.userSurplus = userSurplus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_address
     *
     * @return the value of user.user_address
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_address
     *
     * @param userAddress the value for user.user_address
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbg.generated Mon Nov 26 22:44:51 CST 2018
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}