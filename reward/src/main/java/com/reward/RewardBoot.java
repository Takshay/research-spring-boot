/**
 * 
 */
package com.reward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author takshay.p
 *
 */

@EnableAutoConfiguration
@SpringBootApplication
public class RewardBoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RewardBoot.class, args);
	}

}
