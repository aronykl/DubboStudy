package edu.facade.user.impl;

import edu.facade.user.DubboService;
import org.springframework.stereotype.Service;

/**
 * @Description: Created with IntelliJ IDEA.
 * @Author: zhouwen
 * @Date: 2016/11/22 20:58
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService{

    public void sayHello() {
        System.out.println("Hello world!!!");
    }
}
