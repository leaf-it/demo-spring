package com.cotyledon.web;

import com.cotyledon.vo.DemoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/test")
public class AuthController {
    @RequestMapping(value="/map")
    public Map map(){
        Map <String ,String > map  =  new HashMap<String, String>();
        map.put("name","leaf");
        map.put("age","10");
        return map;
    }
    @RequestMapping(value="/string")
    public String string(){
        return "hello,everything is ok!";
    }
    @RequestMapping(value = "/object")
    public DemoVO getAuthInf(){
        DemoVO authInfo = new DemoVO();
        authInfo.setAuthCode("001");
        authInfo.setAuthDesc("测试权限");
        return authInfo;
    }
    @RequestMapping(value = "/list")
    public List<DemoVO> getListAuthIfo(){
        List<DemoVO> rst = new ArrayList<DemoVO>();
        DemoVO authInfo = new DemoVO();
        authInfo.setAuthCode("001");
        authInfo.setAuthDesc("测试权限");
        rst.add(authInfo);
        return rst;
    }

}
