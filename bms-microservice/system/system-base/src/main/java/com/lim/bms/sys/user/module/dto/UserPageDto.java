package com.lim.bms.sys.user.module.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @author Lim
 * @date 2020/2/11
 */
@Data
public class UserPageDto extends Page {
    private String name;
    private Integer age;
    private String email;
}
