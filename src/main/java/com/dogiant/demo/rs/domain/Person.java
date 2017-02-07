package com.dogiant.demo.rs.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "person", propOrder = { "id", "name", "age", "birthday" })
public class Person {
	
	@XmlAttribute
	private Long id;
	@XmlElement(required = true)
	private String name;
	@XmlElement(name = "price", required = true)
	private Integer age;
	@JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@XmlElement(name = "birthday")
	private Date birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
