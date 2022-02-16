package com.mozoroff.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TimeStamp {
	private Date createdAt;
	private Date updatedAt;
}
