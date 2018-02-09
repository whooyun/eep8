package com.lifopop.eep8.user.po;

import java.io.Serializable;

/**
 *
 * @author Administrator
 * @date 2018/2/6 0006
 */
public class Eep8Test implements Serializable {

    private String uId;

    private String user_id;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
