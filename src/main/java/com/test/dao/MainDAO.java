package com.test.dao;

import com.test.common.AbstractDAO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository(value = "mainDAO")
public class MainDAO extends AbstractDAO {

    private final String NAMESPACE = "main.";

    public List<HashMap<String, Object>> selectTboard() {
        return selectList(NAMESPACE +  "selectTboard" , null);
    }

}
