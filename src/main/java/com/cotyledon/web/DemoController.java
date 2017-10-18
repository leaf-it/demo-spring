package com.cotyledon.web;

import com.cotyledon.vo.DemoVO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/demo")
public class DemoController {
//    @RequestMapping(value="/map")
//    public Map map(){
//        Map <String ,String > map  =  new HashMap<String, String>();
//        map.put("name","leaf");
//        map.put("age","10");
//        return map;
//    }
    @RequestMapping(value="/string")
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    @HystrixCommand(fallbackMethod = "stringHystrix")
    public String string(@RequestBody String flag) {
        if("t".equals(flag)) {
            return "hello,everything is ok!";
        } else if("f".equals(flag)){
            throw new RuntimeException("ha, your input parameter is wrong!");
        } else {
            return null;
        }
    }

    public String stringHystrix(String flag){
        return  "hi,I am sorry ,something is wrong here!please ,wait some seconds!";
    }
//    @RequestMapping(value = "/object")
//    public DemoVO getAuthInf(){
//        DemoVO authInfo = new DemoVO();
//        authInfo.setAuthCode("001");
//        authInfo.setAuthDesc("测试权限");
//        return authInfo;
//    }
//    @RequestMapping(value = "/list")
//    public List<DemoVO> getListAuthIfo(){
//        List<DemoVO> rst = new ArrayList<DemoVO>();
//        DemoVO authInfo = new DemoVO();
//        authInfo.setAuthCode("001");
//        authInfo.setAuthDesc("测试权限");
//        rst.add(authInfo);
//        return rst;
//    }

}
