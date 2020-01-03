package com.eagle.cloud.route.controller;
/**
 * @title: RoadController
 * @projectName display-route-sync
 * @description: TODO
 * @date 2019-11-8 15:24
 */

//import com.eagle.cloud.route.service.RoadService;

import com.eagle.cloud.route.service.ScreenService;
import com.eagle.cloud.route.vo.StepsRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.eagle.cloud.route.vo.StepsRecordNew;

/**
 *@Description: TODO
 *@Author: fwj
 *@Date: 2019-11-8 15:24
 *@Verion: 1.0
 **/
@RestController
@RequestMapping(value = "/roadInfo")
public class RoadController {


    @Autowired
    private ScreenService screenService;

    @RequestMapping(value = "/getRoadAllTraffic",method = RequestMethod.GET)
    public Map<String,Object> getRoadAll() throws SQLException {
        Map<String,Object> modelMap  = new HashMap<String,Object>();
        List<StepsRecord> list = screenService.getRoadAll();
//        List<StepsRecordNew> listNew = screenService.getRoadAllNew(list);
//        modelMap.put("RoadInfo",listNew);
        modelMap.put("roadInfo",list);
        return modelMap;
    }

    //测试
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test() throws SQLException {
        String str = "123";
        return str;
    }


}
