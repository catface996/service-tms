package com.catface.tms;

import com.catface.common.util.EnvUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @since 2020/12/13
 */
@Slf4j
@SpringBootApplication(
				scanBasePackages = {"com.catface"}
)
public class TmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
		log.info("TmsApplication start success!");
		System.out.println("TmsApplication start success!");
		System.out.println(EnvUtil.getSwaggerUrl());
		System.out.println(EnvUtil.getDocUrl());
	}
}
