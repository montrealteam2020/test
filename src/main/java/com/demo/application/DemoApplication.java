package com.demo.application;

import com.demo.application.properties.CodeMappingProperties;
import com.demo.application.properties.MyComponent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	private final CodeMappingProperties codeMappingProperties;
    private final MyComponent myComponent;
	public DemoApplication(CodeMappingProperties codeMappingProperties,MyComponent myComponent) {
		this.codeMappingProperties = codeMappingProperties;
		this.myComponent=myComponent;
	}
	public static void main(String[] args) {
	ApplicationContext applicationContext= SpringApplication.run(DemoApplication.class, args);
		CodeMappingProperties codeMapping=	(CodeMappingProperties)applicationContext.getBean("codeMappingProperties");

     System.out.println("");
	}
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			 System.out.println("Code Mapping: " +codeMappingProperties.getCodesMap());
			//System.out.println("Code Mapping: " + this.myComponent.getCodesMap());
		};
	}
}
