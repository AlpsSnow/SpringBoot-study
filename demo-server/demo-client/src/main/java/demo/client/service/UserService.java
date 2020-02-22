package demo.client.service;

import demo.api.dto.param.UserInfoParamDTO;
import demo.api.dto.result.ResponseResult;
import demo.api.dto.result.user.EmployeInfoResultDTO;
import demo.api.dto.result.user.UserInfoResultDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public ResponseResult<UserInfoResultDTO> getUserInfo(UserInfoParamDTO userInfoParamDTO){
        EmployeInfoResultDTO employeInfoResultDTO = new EmployeInfoResultDTO();
        employeInfoResultDTO.setJobTitle("manager");
        employeInfoResultDTO.setSalary("10000");

        UserInfoResultDTO userInfoResultDTO = new UserInfoResultDTO();
        userInfoResultDTO.setUserName(userInfoParamDTO.getUserName());
        userInfoResultDTO.setEmployeInfoResultDTO(employeInfoResultDTO);

        ResponseResult<UserInfoResultDTO> resultDTOResponseResult = new ResponseResult<UserInfoResultDTO>("0","success",userInfoResultDTO);
        return resultDTOResponseResult;
    }
}
