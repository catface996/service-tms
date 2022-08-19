package com.catface.tms.api.hello.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by catface
 * @date 2020/12/15
 */
@ApiModel(description = "打招呼请求")
@Data
public class SayHelloRequest {

  @ApiModelProperty(value = "年龄", required = true, example = "18")
  @Max(value = 100, message = "年龄最大不能超过100岁")
  @Min(value = 0, message = "年龄是不会小于0的")
  private Integer age;

  @ApiModelProperty(value = "姓名", required = true, example = "大张伟")
  @Size(max = 16, min = 2, message = "姓名需要在2~16个字符")
  private String name;

}
