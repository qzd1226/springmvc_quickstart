package com.qzd.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
// Spring 和 Spring mvc 的区别：
//Spring是一个应用程序开发框架，它提供了一系列的组件和工具，
//        帮助开发人员快速构建企业级应用程序。Spring MVC是Spring框架中的一个模块，
//        它为Web应用程序提供了一套MVC（Model-View-Controller）架构的实现方式。
//        更具体地说，Spring框架是一个全面的框架，
//        用于构建企业级应用程序，包括数据访问、事务管理、安全、远程访问等等。
//        它通过依赖注入（Dependency Injection）和面向切面编程（Aspect Oriented Programming）等技术
//        简化了企业级应用程序的开发过程。
//        Spring MVC则是Spring框架中的一个模块，它是一个基于MVC架构模式的Web框架。
//        它提供了一套标准的MVC架构实现方式，将应用程序的控制逻辑、数据模型以及视图进行了分离，
//        使得开发人员能够更加方便地管理Web应用程序。Spring MVC还提供了很多方便的功能，如请求参数绑定、
//        表单验证、文件上传等等。


public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    protected WebApplicationContext createServletApplicationContext() {
        // 加载spring mvc 对应的容器对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class); //加载配置类
        return ctx;
    }

    protected String[] getServletMappings() {
        //这个方法指定什么请求归spring处理 什么请求归spring mvc处理
        return new String[]{"/"}; // 代表所有请求都归spring mvc 处理
    }

    protected WebApplicationContext createRootApplicationContext() {
        //  加载spring对应的配置文件对象
        return null;
    }
}
