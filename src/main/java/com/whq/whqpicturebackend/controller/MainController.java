package com.whq.whqpicturebackend.controller;

import com.whq.whqpicturebackend.common.BaseResponse;
import com.whq.whqpicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("healthy");
    }
}
