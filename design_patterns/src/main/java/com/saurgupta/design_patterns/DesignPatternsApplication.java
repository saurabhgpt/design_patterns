package com.saurgupta.design_patterns;

import com.saurgupta.design_patterns.Learning.Creational.Singleton.DoubleCheckedSingleton;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		DoubleCheckedSingleton instance = DoubleCheckedSingleton.getInstance("hey");
		System.out.println(instance.getData());
	}

}
