package com.lim.bms.sys.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lim.bms.sys.user.entity.SysUser;
import com.lim.bms.sys.user.module.dto.SysUserPageDto;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 分页查询用户
     * @param pageDto 查询参数
     * @return IPage<SysUser>
     */
    IPage<SysUser> pageCondition(SysUserPageDto pageDto);
}
