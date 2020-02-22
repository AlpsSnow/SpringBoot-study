package demo.api.controller;

import demo.api.dto.param.UserInfoParamDTO;
import demo.api.dto.result.ResponseResult;
import demo.api.dto.result.user.UserInfoResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping(value = "api/user")
@Api(value = "UserApi",tags = "人员信息API")
public interface UserApi {
    /**
     * 取得人员信息
     */
    @ApiOperation(value = "取得人员信息",notes = "根据姓名取得该员工的雇佣信息")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    ResponseResult<UserInfoResultDTO> getUserInfo(@ApiParam(name = "UserInfoParam", value = "待查询人员信息")
                                  @RequestBody UserInfoParamDTO UserInfoParam);
}
