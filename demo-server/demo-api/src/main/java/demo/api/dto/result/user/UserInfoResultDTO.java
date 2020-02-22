package demo.api.dto.result.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "UserInfoResultDTO",description = "人员信息返回类")
public class UserInfoResultDTO {

    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名")
    private String userName;

    /**
     * 雇员信息
     */
    @ApiModelProperty(value = "employInfoDTO", notes = "雇员信息，包括职称和工资")
    private EmployeInfoResultDTO employeInfoResultDTO;
}
