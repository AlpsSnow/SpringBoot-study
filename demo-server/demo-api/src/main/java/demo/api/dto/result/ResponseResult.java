package demo.api.dto.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
public class ResponseResult<T> implements Serializable {

    @Setter
    @Getter
    private String status;

    @Setter
    @Getter
    private String msg;

    @Getter
    private final T obj;
}
