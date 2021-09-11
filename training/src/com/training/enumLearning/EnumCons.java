package com.training.enumLearning;

public enum EnumCons {
	HIGH(1), MEDIUM(2), LOW(3);
	
	int integerInput =0;
	//cons are private by default
	private EnumCons(int i) {
		this.integerInput=i;
	}

	public int getIntegerInput() {
		return integerInput;
	}
	
	
}
