package com.si.beans;

import java.util.List;

public interface ICourier {
	
	String sendCourier(List<String> product, String address);

}
