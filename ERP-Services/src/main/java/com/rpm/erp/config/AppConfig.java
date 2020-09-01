package com.rpm.erp.config;

import static com.rpm.erp.constant.ERPConstants.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mohan
 * 
 *         Configuration class to scan the required packages - used for testing
 *
 */
@Configuration
@ComponentScan(basePackages = { PACKAGE })
public class AppConfig {

}
