package com.lim.bms.sys.user.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lim.bms.sys.user.entity.User;
import com.lim.bms.sys.user.module.dto.UserListDto;
import com.lim.bms.sys.user.module.dto.UserPageDto;
import com.lim.bms.sys.user.module.dto.UserSaveDto;
import com.lim.bms.sys.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户
 * @author Lim
 * @date 2020/2/11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 条件查询所有
     * @return List<User>
     */
    @GetMapping("/list/condition")
    public List<User> listCondition(UserListDto userListDto) {
        return userService.listCondition(userListDto);
    }

    /**
     * 分页查询
     * @return List<User>
     */
    @GetMapping("/page")
    public IPage<User> page() {
        Page<User> page = new Page<>();
        page.setSize(3);
        page.setCurrent(1);
        return userService.page(page);
    }

    /**
     * 条件分页查询
     * @return List<User>
     */
    @GetMapping("/page/condition")
    public IPage<User> pageCondition(UserPageDto pageDto) {
        return userService.pageCondition(pageDto);
    }

    /**
     * 查询单个
     * @param id 用户id
     * @return User
     */
    @GetMapping("/single")
    public User single(Long id) {
        return userService.getById(id);
    }

    /**
     * 新增
     * @param userSaveDto 用户信息
     * @return 影响的记录条数
     */
    @PostMapping
    public Integer insert(@RequestBody UserSaveDto userSaveDto) {
        return userService.insert(userSaveDto);
    }

    /**
     * 修改
     * @param user 用户信息
     * @return 影响的记录条数
     */
    @PutMapping
    public Integer update(@RequestBody User user) {
        return userService.update(user);
    }

    /**
     * 删除
     * @param id 用户id
     * @return 影响的记录条数
     */
    @DeleteMapping
    public Integer del(Long id) {
        return userService.delete(id);
    }

}
