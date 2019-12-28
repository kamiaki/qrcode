package com.aki.qrcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Controller
public class QrcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(QrcodeApplication.class, args);
    }

    @RequestMapping("testPage")
    public String toPage(Model model){
        model.addAttribute("msg","测试传值");
        return "testPage";
    }

    @ResponseBody
    @RequestMapping(value = "jQueryAjaxTest", method = RequestMethod.POST)
    public Map jQueryAjaxTest(@RequestBody Map requestBodyMap){
        Map map = new HashMap();
        map.put("value","value1");
        map.put("map",requestBodyMap);
        map.put("mapStr",requestBodyMap.toString());
        return map;
    }
}
