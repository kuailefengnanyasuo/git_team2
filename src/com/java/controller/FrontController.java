package com.java.controller;

import com.java.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//一个普通的类被controller修饰之后就会变成一个servlet
@Controller
@RequestMapping(value = "/admin")
public class FrontController {
            /*
            @RequestMapping指定虚拟路径
            value:配置对外访问的虚拟路径
            method:请求方法，常用GET,POST 不指定的话默认GET/POST都可以
            * */
     @RequestMapping(value={"/login.do"},method = RequestMethod.GET)
     public void login(Student student) {
        System.out.println("FrontController。。。login。登陆成功");

    }



     //想要打印出内容必须加@ResponseBody注解除void以外
     @RequestMapping("/login1.do")
     public @ResponseBody Map<String,Object> login1(){
        Map<String,Object> resluMap = new HashMap<>();
        resluMap.put("id",1L);
        resluMap.put("uName","亚索");
        return resluMap;
    }


    @RequestMapping("/test1.do")
    public @ResponseBody String test1(){
       return "hello";
    }


    @RequestMapping(value = "/qqzhuche.do")
    /*public void qqRegister(String id,String psw ,String phone,Integer age){
        System.out.println(id+","+psw+","+phone+","+age);
    }*/
    /*public void qqRegister(Student qqInfo){
        System.out.println("qq="+qqInfo);
    }*/
    public @ResponseBody boolean qqRegiste(@RequestParam Map<String,Object> qqInfo){
        System.out.println("qq="+qqInfo);
        return true;

    }
}
