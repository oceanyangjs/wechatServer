package com.ocean.demo.dao;

import com.ocean.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() {
        List<Area> arealist = areaDao.queryArea();
        System.out.print(arealist.size());
    }

    @Test
    @Ignore
    public void queryAreById() {
    }

    @Test
    @Ignore
    public void insertArea() {
    }

    @Test
    @Ignore
    public void updateArea() {
    }

    @Test
    @Ignore
    public void deleteArea() {
    }
}