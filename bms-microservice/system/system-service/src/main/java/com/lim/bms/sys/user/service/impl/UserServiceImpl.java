package com.lim.bms.sys.user.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lim.bms.sys.user.entity.User;
import com.lim.bms.sys.user.mapper.UserMapper;
import com.lim.bms.sys.user.module.dto.UserListDto;
import com.lim.bms.sys.user.module.dto.UserPageDto;
import com.lim.bms.sys.user.module.dto.UserSaveDto;
import com.lim.bms.sys.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lim
 * @date 2020/2/11
 */
@Service
@Primary
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> listCondition(UserListDto userListDto) {
        // baseMapper 内置方法查询 - 对象
        User user = new User();
        BeanUtils.copyProperties(userListDto, user);
        List<User> rs1 = baseMapper.selectList(Wrappers.query(user));
        log.info("rs1: {}", rs1);

        return rs1;
    }

    /**
     * 5中查询方式，推荐使用baseMapper内置方法查询
     */
    @Override
    public IPage<User> page(Page<User> page) {

        // 使用baseMapper查询
        IPage<User> page5 = baseMapper.selectPage(page, null);
        log.info("page5 {}", JSONObject.toJSONString(page5));

        return page5;
    }

    @Override
    public IPage<User> pageCondition(UserPageDto userPageDto) {

        // 使用mapper内置方法查询
        // 其他分页查询参考page，查询条件设置参考listCondition
        User user = new User();
        BeanUtils.copyProperties(userPageDto, user);
        IPage<User> page1 = baseMapper.selectPage(userPageDto, new QueryWrapper<>(user));

        return page1;
    }

    @Override
    public User getById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public Integer insert(UserSaveDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return baseMapper.insert(user);
    }

    @Override
    public Integer update(User user) {
        // 根据id更新整个对象
        Integer rs = baseMapper.updateById(user);

        // 使用wrapper更新整个对象，id不会更新
        UpdateWrapper<User> uw = new UpdateWrapper<>();
        uw.lambda().eq(User::getId, user.getId());
        // user.setId((long) 7); // 此处改变id无效，不更新id
        baseMapper.update(user, uw);

        // 使用wrapper更新
        uw = new UpdateWrapper<>();
        uw.set("name", user.getName()).set("age", user.getAge()).set("email", user.getEmail())
                .eq("id", user.getId());
        baseMapper.update(null, uw);

        // 使用wrapper lambda更新
        uw = new UpdateWrapper<>();
        uw.lambda().set(User::getName, user.getName()).set(User::getAge, user.getAge()).set(User::getEmail, user.getEmail())
                .eq(User::getId, user.getId());
        baseMapper.update(null, uw);

        // 省略根据mapper、xml更新

        return rs;
    }

    @Override
    public Integer delete(Long id) {
        return baseMapper.deleteById(id);
    }
}
