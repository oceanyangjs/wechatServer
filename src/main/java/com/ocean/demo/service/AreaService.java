package com.ocean.demo.service;

import com.ocean.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();
    Area queryAreById(int areaId);
    boolean insertArea(Area area);
    boolean updateArea(Area area);
    boolean deleteArea(Integer areaId);
}
