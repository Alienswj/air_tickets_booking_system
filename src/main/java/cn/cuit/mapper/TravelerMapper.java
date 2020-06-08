package cn.cuit.mapper;

import cn.cuit.model.TravelerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TravelerMapper {
    int addTraveler(TravelerInfo travelerInfo);
    int deleteTravelerById(String id);
    int updateTravelerInfoSelective(TravelerInfo travelerInfo);
    List<TravelerInfo> getAllTravelersWithUid(String uid);

}
