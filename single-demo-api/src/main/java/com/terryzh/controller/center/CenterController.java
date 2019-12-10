package com.terryzh.controller.center;

import com.terryzh.pojo.Users;
import com.terryzh.service.center.CenterUserService;
import com.terryzh.utils.IMOOCJSONResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CenterController {

    @Autowired
    private CenterUserService centerUserService;

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", httpMethod = "GET")
    @GetMapping("userInfo")
    public IMOOCJSONResult userInfo(
            @ApiParam(name = "userId", value = "用户 id", required = true)
            @RequestParam String userId) {
        Users user = centerUserService.queryUserInfo(userId);
        return IMOOCJSONResult.ok(user);
    }
}
