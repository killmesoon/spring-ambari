package org.inspur.insight.server.service.impl;

import org.inspur.insight.server.entity.Users;
import org.inspur.insight.server.mapper.UsersMapper;
import org.inspur.insight.server.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dky
 * @since 2021-06-27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
