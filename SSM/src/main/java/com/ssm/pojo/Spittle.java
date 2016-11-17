package com.ssm.pojo;

import java.util.Date;

//import org.springframework.stereotype.Component;
//@Component
public class Spittle {
	private Long id;
	private String message;
	private Date time;
	private Double latitude;//纬度
	private Double longitude;//经度
	/**
	 * 无参构造
	 */
	public Spittle() {
		super();
	}
	/**
	 * 部分有参构造
	 * @param message
	 * @param time
	 */
	public Spittle(String message, Date time) {
		this(null,message,time,null,null);
	}
	/**
	 * 全参构造
	 * @param id
	 * @param message
	 * @param time
	 * @param latitude
	 * @param longitude
	 */
	
	public Spittle(Long id, String message, Date time, Double latitude,
			Double longitude) {
		super();
		this.id = id;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Spittle [id=" + id + ", message=" + message + ", time=" + time
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
