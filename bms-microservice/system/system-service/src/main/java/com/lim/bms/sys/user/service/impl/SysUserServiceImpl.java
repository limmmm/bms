package com.lim.bms.sys.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lim.bms.sys.user.entity.SysUser;
import com.lim.bms.sys.user.mapper.SysUserMapper;
import com.lim.bms.sys.user.module.dto.SysUserPageDto;
import com.lim.bms.sys.user.service.ISysUserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author lim
 * @since 2020-03-06
 */
@Service
@Primary
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public IPage<SysUser> pageCondition(SysUserPageDto pageDto) {
        QueryWrapper<SysUser> qw = new QueryWrapper<>();
        qw.lambda().eq(SysUser::getAccount, pageDto.getAccount());
        IPage<SysUser> rs = baseMapper.selectPage(pageDto, qw);
        return rs;
    }
}
