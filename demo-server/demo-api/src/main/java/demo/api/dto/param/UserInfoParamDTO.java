package demo.api.dto.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Data
@ApiModel(value = "UserInfoParamDTO", description = "查询人员信息类")
public class UserInfoParamDTO implements Serializable {
    /**
     * 人员姓名
     */
    @ApiModelProperty(value = "人员姓名", notes = "不允许与其他人员姓名重复")
    private String userName;
}
