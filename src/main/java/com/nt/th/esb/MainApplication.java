package com.nt.th.esb;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.th.esb.constant.ESBConstant;
import com.nt.th.esb.constant.WSConstant;
import com.nt.th.esb.controllers.ESBCommonImpl;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {
	private static Logger log = LogManager.getLogger();
	//http://10.0.102.38:8080/ESB2PlusCRM/TOTBilling/ProxyServices/CRM?wsdl
	
	public static void main(String[] args) {
		log.debug("start : initial spring boot");
		SpringApplication.run(MainApplication.class, args);
		log.debug("end : initial spring boot");
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MainApplication.class);
	}
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Bean
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), ESBConstant.CXF_SERVLET_PATH + WSConstant.SLASH_STAR);
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    
	@Bean
	public EndpointImpl setesbCommonServiceEndPoint() {
		Bus bus = (Bus) applicationContext.getBean(Bus.DEFAULT_BUS_ID);
		Object implementor = new ESBCommonImpl();
		EndpointImpl endpoint = new EndpointImpl(bus, implementor);
		endpoint.publish( ESBConstant.SOAP_ENPOINT_CRM );
		return endpoint;
	}
}
