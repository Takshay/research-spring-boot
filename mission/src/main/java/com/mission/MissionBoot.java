/**
 * 
 */
package com.mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author takshay.p
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class MissionBoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MissionBoot.class, args);
	}

}
