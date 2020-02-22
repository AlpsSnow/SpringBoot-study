package demo.client.controller;

import demo.api.controller.UserApi;
import demo.api.dto.param.UserInfoParamDTO;
import demo.api.dto.result.ResponseResult;
import demo.api.dto.result.user.UserInfoResultDTO;
import demo.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiImpl implements UserApi {
    @Autowired
    private UserService userService;

    @Override
    public ResponseResult<UserInfoResultDTO> getUserInfo(UserInfoParamDTO userInfoParamDTO) {
        return userService.getUserInfo(userInfoParamDTO);
    }
}
