package com.com.obsydian.web.locksite.domain.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeGenerator<NewCode> {

	private int newCode;
	private int generatedCode;
	private List<Integer> newCodesList = new ArrayList<>();
	private Random random = new Random();

	public int generateCode() {
		generatedCode = random.nextInt(9999999) + 10000000;
		return generatedCode;
	}

	public List<Integer> generateCodeLists(int numberOfCodesToGenerate) {
		if(numberOfCodesToGenerate <= 50) {
			try {
				for (int i = 1; i <= numberOfCodesToGenerate; i++) {
					int tmp = generateCode();
					newCodesList.add(tmp);
				}
				return newCodesList;
			} catch (Exception e) {
				System.out.println("Enter correct number, greater then '0'");
			}

		} else {
			System.out.println("Maximum generated for once number is 50");
		}return new ArrayList<>();
	}
}