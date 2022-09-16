package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator calc = new StandardCalculator();
		calc.add(4, 5);
		System.out.println(calc.getResult());
	}

}
