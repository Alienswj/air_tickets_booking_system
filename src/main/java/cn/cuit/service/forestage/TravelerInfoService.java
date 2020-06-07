package cn.cuit.service.forestage;

import cn.cuit.mapper.TravelerMapper;
import cn.cuit.model.TravelerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TravelerInfoService {

    @Autowired
    TravelerMapper travelerMapper;

    public boolean addTraveler(TravelerInfo travelerInfo){
        System.out.println(travelerInfo.getName());
        return travelerMapper.addTraveler(travelerInfo) != 0;
    }

    @Transactional
    public boolean updateTravelerInfo(TravelerInfo travelerInfo){
        return travelerMapper.deleteTravelerById(travelerInfo.getId()) != 0 && travelerMapper.addTraveler(travelerInfo) != 0;
    }

    public boolean deleteTraveler(String id){
        return travelerMapper.deleteTravelerById(id)!=0;
    }

    public List<TravelerInfo> getAllTravelersWithUid(String uid){
        return travelerMapper.getAllTravelersWithUid(uid);
    }
}
