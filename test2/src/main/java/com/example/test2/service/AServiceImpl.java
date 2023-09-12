package com.example.test2.service;

import com.example.test2.bean.ABean;
import com.example.test2.bean.Crimes;
import com.example.test2.bean.Id;
import com.example.test2.mapper.AMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nmy
 * @title: AServiceImpl
 * @date 2023/9/12 12:07
 */
@Service
public class AServiceImpl implements AService {

    @Resource
    AMapper aMapper;

    @Override
    public List<ABean> queryCrimeStat() {
        return aMapper.queryCrimeStat();
    }

    @Override
    public Id addCrime(Crimes crimes) {
        if (crimes.getOffenceCode() == 0 || crimes.getVictims() == 0){
            return new Id(0);
        }
        if ("".equals(crimes.getCity())){
            return new Id(0);
        }
        crimes.setCity(crimes.getCity().toUpperCase());
        aMapper.addCrime(crimes);
        return new Id(crimes.getIncidentId());
    }
}
