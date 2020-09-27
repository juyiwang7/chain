package com.huiyi.common.exception;

/**
 * huiyi异常类
 * @author Syman
 */
public class HuiYiException extends RuntimeException
{
    //
    private static final long serialVersionUID = 3640068073161175965L;

    private String            msg;

    private int               code             = 500;

    public HuiYiException(String msg)
    {
        super(msg);
        this.msg = msg;
    }

    public HuiYiException(String msg, Throwable e)
    {
        super(msg, e);
        this.msg = msg;
    }

    public HuiYiException(String msg, int code)
    {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public HuiYiException(String msg, int code, Throwable e)
    {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }
}