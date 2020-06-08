package cn.cuit.web.controller.forestage;

import cn.cuit.model.RespBean;
import cn.cuit.model.TravelerInfo;
import cn.cuit.service.forestage.TravelerInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "与账号中保存的旅客信息相关操作")
@RestController
public class TravelerInfoController {
    @Autowired
    TravelerInfoService travelerInfoService;

    @ApiOperation("添加订票旅客信息")
    @PostMapping("/traveler")
    public RespBean addTraveler(@RequestBody TravelerInfo travelerInfo){
        System.out.println(travelerInfo.getIdNumber());
        if(travelerInfoService.addTraveler(travelerInfo)) {
            return RespBean.ok("添加成功！");
        }else{
            return RespBean.error("添加错误！");
        }
    }

    @ApiOperation(value = "更新旅客信息",notes = "更新操作分为两步：删除一条信息，再增加一条新信息")
    @PutMapping("/traveler")
    public RespBean updateTravelerInfo(@RequestBody TravelerInfo travelerInfo){
        if(travelerInfoService.updateTravelerInfo(travelerInfo)){
            return RespBean.ok("更新成功！");
        }else{
            return RespBean.error("更新失败！");
        }
    }

    @ApiOperation(value = "删除旅客信息",notes = "通过路径传id值")
    @DeleteMapping("/traveler/{id}")
    public RespBean deleteTraveler(@PathVariable String id){
        if(travelerInfoService.deleteTraveler(id)){
            return RespBean.ok("删除成功！");
        }else{
            return RespBean.error("删除失败！");
        }
    }

    @ApiOperation("获取该用户保存的所有旅客信息")
    @GetMapping("/traveler/{uid}")
    public List<TravelerInfo> getAllTravelersWithUid(@PathVariable String uid){
        return travelerInfoService.getAllTravelersWithUid(uid);
    }
}
