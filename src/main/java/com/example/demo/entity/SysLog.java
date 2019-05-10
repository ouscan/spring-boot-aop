package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @Author lau
 * @Date 2019/5/10
 */
@Data
public class SysLog implements Serializable {
    private static final long serialVersionUID = -6309732882044872298L;

    private Integer id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;
}
