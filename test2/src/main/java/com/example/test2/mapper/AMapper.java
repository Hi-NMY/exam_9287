package com.example.test2.mapper;

import com.example.test2.bean.ABean;
import com.example.test2.bean.Crime;
import com.example.test2.bean.Crimes;

import java.util.List;

/**
 * @author nmy
 * @title: AMapper
 * @date 2023/9/12 12:10
 */
public interface AMapper {

    List<ABean> queryCrimeStat();

    Long addCrime(Crimes crimes);

}
