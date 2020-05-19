package com.kh.run;

import com.kh.operator.Arithmatic;
import com.kh.operator.Comparison;
import com.kh.operator.Compound;
import com.kh.operator.Logical;
import com.kh.operator.Operator;
import com.kh.operator.PrepareOc;
import com.kh.operator.Triple;

public class Run {
	public static void main(String[] args) {

		// Arithmatic am = new Arithmatic();
		// am.method1();

		// Comparison cp = new Comparison();
		// cp.method1();

		// Logical logical = new Logical();
		// logical.method1();

		// Compound compound = new Compound();
		// compound.method1();

		// Triple triple = new Triple();
		// triple.method4();

		// PrepareOc prepareoc = new PrepareOc();
		// prepareoc.method3();

		Operator operator = new Operator();
		operator.singleOp();
	}
}
