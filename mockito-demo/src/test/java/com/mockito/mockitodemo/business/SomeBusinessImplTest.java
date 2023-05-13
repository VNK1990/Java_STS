package com.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplTest {

	@Mock
	private DataService dataServiceMock = mock(DataService.class);
	
	@InjectMocks
	private SomeBusinessImpl businessService;

	@Test
	void testBasic_maxFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 25, 18, 15 });
		assertEquals(25, businessService.maxFromAllData());
	}

	@Test
	void testWithTwoElementArray_maxFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 4, 8 });
		assertEquals(8, businessService.maxFromAllData());
	}

	@Test
	void testWithNoValues_maxFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[]{});
		assertEquals(Integer.MIN_VALUE, businessService.maxFromAllData());
	}
}
