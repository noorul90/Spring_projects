package com.ep.beans;

import org.springframework.context.ApplicationEvent;

public class RefreshEvent extends ApplicationEvent {
	private String tableName;

	public RefreshEvent(Object source, String tableName) {
		super(source);
		this.tableName = tableName;
	}

	public String getTableName() {
		return tableName;
	}

}
