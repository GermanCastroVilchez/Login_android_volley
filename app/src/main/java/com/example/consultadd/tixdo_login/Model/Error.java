package com.example.consultadd.tixdo_login.Model;

/**
 * Created by consultadd on 4/8/16.
 */
public class Error {

    /**
     * error_desc : Unable to log in with provided credentials.
     * error_code : 1405
     */

    private String error_desc;
    private int error_code;

    public String getError_desc() {
        return error_desc;
    }

    public void setError_desc(String error_desc) {
        this.error_desc = error_desc;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
