package org.inspur.insight.server.service.impl;

import org.inspur.insight.server.entity.Hosts;
import org.inspur.insight.server.mapper.HostsMapper;
import org.inspur.insight.server.service.IHostsService;
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
public class HostsServiceImpl extends ServiceImpl<HostsMapper, Hosts> implements IHostsService {

}
