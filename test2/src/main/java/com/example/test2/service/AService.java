package com.example.test2.service;

import com.example.test2.bean.ABean;
import com.example.test2.bean.Crimes;
import com.example.test2.bean.Id;

import java.util.List;

/**
 * @author nmy
 * @title: AService
 * @date 2023/9/12 11:57
 */
public interface AService {

    List<ABean> queryCrimeStat();

    Id addCrime(Crimes crimes);

}
