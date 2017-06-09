package com.hyooc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="index")
public class IndexController {

	@RequestMapping(value="/",produces="text/html;charset=UTF-8")
	public @ResponseBody String index(){
		//返回一个空就好了
		return "hello lbz-api";
	}
}
