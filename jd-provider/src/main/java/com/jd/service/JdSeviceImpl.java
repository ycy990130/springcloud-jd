package com.jd.service;

import com.jd.mapper.JdMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JdSeviceImpl implements JdService{

    @Resource
    private JdMapper jdMapper;

}
