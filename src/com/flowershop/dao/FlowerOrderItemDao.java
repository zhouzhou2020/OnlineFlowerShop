package com.flowershop.dao;

import com.flowershop.bean.FlowerOrderItem;

public interface FlowerOrderItemDao {
	public boolean insertOrderItem(FlowerOrderItem orderitem);
	public boolean deleteOrderItem(FlowerOrderItem orderitem);
	public boolean updateOrderItem(FlowerOrderItem orderitem);
	public FlowerOrderItem getOrderItemInOrderItemId(FlowerOrderItem orderitem);
}
