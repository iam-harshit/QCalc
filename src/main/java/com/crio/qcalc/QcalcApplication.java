package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		// StandardCalculator calc = new StandardCalculator();
		LogicCalculator calc = new LogicCalculator();
		// calc.add(Double.MAX_VALUE, 5);
		calc.OR(8, 6);
		System.out.println(calc.getResult());
	}

}
