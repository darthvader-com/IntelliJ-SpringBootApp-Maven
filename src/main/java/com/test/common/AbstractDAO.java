package com.test.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractDAO {

    @Autowired
    private SqlSessionTemplate session;

    public List<HashMap<String, Object>> selectList(String val1, Object val2){
        return  session.selectList(val1, val2);
    }

}
