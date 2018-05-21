package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 该注解指定项目为springboot，由此类当作程序入口
 自动装配 web 依赖的环境
 **/
@RestController
@SpringBootApplication
@ServletComponentScan
@ComponentScan("com")
public class DemoApplication extends SpringBootServletInitializer {
	@RequestMapping("/")
	String index() {
		return "Hello Spring Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * 这里也可以自定义 Servlet、Filter 和 Listener 的配置
	 * @param servletContext
	 * @throws ServletException
	 */
	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 配置 Servlet
		servletContext.addServlet("servletTest",new ServletTest())
				.addMapping("/servletTest");
		// 配置过滤器
		servletContext.addFilter("timeFilter",new TimeFilter())
				.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
		// 配置监听器
		servletContext.addListener(new ListenerTest());
	}*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}
}
