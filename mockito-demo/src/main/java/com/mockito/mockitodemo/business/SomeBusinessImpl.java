package com.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int maxFromAllData() {
		int[] allData = dataService.retriveAllData();
		int maxValue = Integer.MIN_VALUE;
		for (int value : allData) {
			if (value > maxValue)
				maxValue = value;
		}
		return maxValue;
	}
}

interface DataService {
	int[] retriveAllData();
}
