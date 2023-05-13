package com.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ListTest {

	@Mock
	private List<String> mockList;

	@Test
	void test() {
		when(mockList.size()).thenReturn(4).thenReturn(2);
		assertEquals(4, mockList.size());
		assertEquals(2, mockList.size());
 	}

	@Test
	void test_specificParameters() {
		when(mockList.get(0)).thenReturn("Value1");
		assertEquals("Value1", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}

	@Test
	void test_genericParameters() {
		when(mockList.get(Mockito.anyInt())).thenReturn("SomeValue");
		assertEquals("SomeValue", mockList.get(0));
	}
}
