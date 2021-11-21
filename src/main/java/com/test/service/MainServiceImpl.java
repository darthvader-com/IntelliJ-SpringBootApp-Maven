package com.test.service;

import com.test.dao.MainDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service(value = "mainService")
public class MainServiceImpl implements MainService {

    @Resource(name = "mainDAO")
    private MainDAO mainDAO;

    @Override
    public List<HashMap<String, Object>> selectTboard() {
        return mainDAO.selectTboard();
    }

}
