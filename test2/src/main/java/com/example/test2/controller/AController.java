package com.example.test2.controller;

import com.example.test2.bean.ABean;
import com.example.test2.bean.Crime;
import com.example.test2.bean.Crimes;
import com.example.test2.bean.Id;
import com.example.test2.service.AService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nmy
 * @title: AController
 * @date 2023/9/12 11:54
 */
@RequestMapping("/api")
@RestController
public class AController {

    @Resource
    AService aService;

    @GetMapping("/crime/stat")
    public List<ABean> queryCrimeStat() {
        List<ABean> aBeans = aService.queryCrimeStat();
        return aBeans;
    }

    @PostMapping("/crime")
    public Id addCrime(@RequestBody Crimes crimes) {
        Id id = aService.addCrime(crimes);
        return id;
    }
}
