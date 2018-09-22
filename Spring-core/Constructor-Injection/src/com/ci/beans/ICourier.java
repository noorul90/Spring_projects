package com.ci.beans;

import java.util.List;

public interface ICourier {
	
	String sendCourier(List<String> product, String address);

}
