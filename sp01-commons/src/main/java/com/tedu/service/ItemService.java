package com.tedu.service;

import java.util.List;

import com.tedu.pojo.ltem;

public interface ItemService {
	List<ltem>getItems(String orderId);
	void decreaseNumbers(List<ltem> list);
}
