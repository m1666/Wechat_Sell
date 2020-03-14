package com.mann.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 22:15:47
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
