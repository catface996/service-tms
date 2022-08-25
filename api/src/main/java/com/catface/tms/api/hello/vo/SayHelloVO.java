package com.catface.tms.api.hello.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by 大猫
 * @since 2022/4/15 2:42 PM catface996 出品
 */
@Data
@ApiModel(description = "打招呼的回应结果")
public class SayHelloVO {

    @ApiModelProperty(value = "年龄", required = true, example = "16")
    private Integer age;

    @ApiModelProperty(value = "年龄", required = true, example = "16")
    private String name;

    @ApiModelProperty(value = "简介", example = "我是一个粉刷匠")
    private String briefDesc;

    public SayHelloVO(String name) {
        this.name = name;
    }

    public SayHelloVO() {

    }
}
