package com.sen.hessian.study.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.sen.hessian.study.service.api.UserService;

import java.net.MalformedURLException;

/**
 * @Auther: Sen
 * @Date: 2019/12/13 22:50
 * @Description:
 */
public class HessianClient {

    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/ServiceServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        UserService service = (UserService) factory.create(UserService.class, url);
        System.out.println(service.getUser().getName());
    }
}
