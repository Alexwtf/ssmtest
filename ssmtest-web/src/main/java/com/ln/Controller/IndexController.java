package com.ln.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lining on 2019/6/18.
 */
@Controller
@RequestMapping("/Index")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
