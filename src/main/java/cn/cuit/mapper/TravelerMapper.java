package cn.cuit.mapper;

import cn.cuit.model.TravelerInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TravelerMapper {
    int addTraveler(TravelerInfo travelerInfo);
    int deleteTravelerById(String id);
    int updateTravelerInfoSelective(TravelerInfo travelerInfo);
    List<TravelerInfo> getAllTravelersWithUid(String uid);

}
