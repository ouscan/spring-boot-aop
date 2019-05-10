package com.example.demo.mapper;

import com.example.demo.entity.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author lau
 * @Date 2019/5/10
 */
@Mapper
@Component
public interface SysLogMapper {
    @Insert("INSERT INTO sys_log(username, operation, time, method, params, ip, create_time)" +
            "VALUES(#{username}, #{operation}, #{time}, #{method}, #{params}, #{ip}, #{createTime})")
    void saveSysLog(SysLog syslog);
}
