package org.wdzl.pojo;

public class MyFriends {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_friends.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_friends.my_user_id
     *
     * @mbggenerated
     */
    private String myUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_friends.my_friend_user_id
     *
     * @mbggenerated
     */
    private String myFriendUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_friends.id
     *
     * @return the value of my_friends.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_friends.id
     *
     * @param id the value for my_friends.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_friends.my_user_id
     *
     * @return the value of my_friends.my_user_id
     *
     * @mbggenerated
     */
    public String getMyUserId() {
        return myUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_friends.my_user_id
     *
     * @param myUserId the value for my_friends.my_user_id
     *
     * @mbggenerated
     */
    public void setMyUserId(String myUserId) {
        this.myUserId = myUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_friends.my_friend_user_id
     *
     * @return the value of my_friends.my_friend_user_id
     *
     * @mbggenerated
     */
    public String getMyFriendUserId() {
        return myFriendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_friends.my_friend_user_id
     *
     * @param myFriendUserId the value for my_friends.my_friend_user_id
     *
     * @mbggenerated
     */
    public void setMyFriendUserId(String myFriendUserId) {
        this.myFriendUserId = myFriendUserId;
    }
}