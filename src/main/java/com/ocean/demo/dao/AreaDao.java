package com.ocean.demo.dao;

import com.ocean.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();
    Area queryAreById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(Integer areaId);
}
