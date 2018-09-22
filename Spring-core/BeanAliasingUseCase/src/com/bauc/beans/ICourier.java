package com.bauc.beans;

import java.util.List;

public interface ICourier {
	
	String sendCourier(List<String> product, Address add);

}
