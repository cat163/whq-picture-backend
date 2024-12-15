package com.whq.whqpicturebackend.common;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "通用分页请求参数")
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
