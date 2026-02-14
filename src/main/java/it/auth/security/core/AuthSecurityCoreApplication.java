package it.auth.security.core;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(basePackages = "it.auth.security.core")
@EntityScan(basePackages = "it.auth.security.core.entity")
public class AuthSecurityCoreApplication{

}
