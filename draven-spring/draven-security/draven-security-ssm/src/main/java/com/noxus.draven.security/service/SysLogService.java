package com.noxus.draven.security.service;

import com.noxus.draven.security.pojo.SysLog;

import java.util.List;

public interface SysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
