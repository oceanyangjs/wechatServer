package com.ocean.demo.controller;

import com.ocean.demo.entity.Area;
import com.ocean.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value="listArea",method= RequestMethod.GET)
    public Map<String,Object> listArea(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<Area> list = areaService.queryArea();
        modelMap.put("areaList",list);
        return  modelMap;
    }

    @RequestMapping(value="getArea",method= RequestMethod.GET)
    public Map<String,Object> listArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        Area area = areaService.queryAreById(areaId);
        modelMap.put("area",area);
        return  modelMap;
    }

    @RequestMapping(value="addArea",method= RequestMethod.POST)
    public Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",areaService.insertArea(area));
        return  modelMap;
    }

    @RequestMapping(value="updateArea",method= RequestMethod.POST)
    public Map<String,Object> updateArea(@RequestBody Area area){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",areaService.updateArea(area));
        return  modelMap;
    }

    @RequestMapping(value="deleteArea",method= RequestMethod.GET)
    public Map<String,Object> updateArea(Integer areaId){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        modelMap.put("success",areaService.deleteArea(areaId));
        return  modelMap;
    }
}
