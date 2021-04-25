package cn.com.teamsun.circleci.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by moodpo on 2021/4/25
 */
@Api(tags = "测试API")
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @ApiOperation("测试API")
    @GetMapping
    public String test(String param) {
        return String.format("Hello %s !", param);
    }

}
