package demo.api.dto.result.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "EmployeInfoResultDTO",description = "雇用信息返回类")
public class EmployeInfoResultDTO implements Serializable {
    /**
     * 职称
     */
    @ApiModelProperty(value = "职称")
    private String jobTitle;

    /**
     * 工资
     */
    @ApiModelProperty(value = "工资")
    private String salary;

}
