package com.saurgupta.design_patterns;

import com.saurgupta.design_patterns.Learning.Creational.Singleton.Singleton;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance("hey");
		System.out.println(instance.getData());
	}

}
