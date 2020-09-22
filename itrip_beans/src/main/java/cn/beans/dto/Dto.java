package cn.beans.dto;

import java.io.Serializable;
import java.util.Date;

public class Dto<T> implements Serializable {
    private String errorCode;
    private String msg;
    private  String success;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    private T date;



    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }




}
