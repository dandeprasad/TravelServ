package com.travelService.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"money"})
@Component
public class SampleResponse {
	@JsonProperty("money")
	private String money;
	
	//@JsonIgnore
	@JsonProperty("additionalPorperties")
private Map<String,String> additionalPorperties = new HashMap<String,String>();

	public Map<String, String> getAdditionalPorperties() {
	return additionalPorperties;
}

public void setAdditionalPorperties(Map<String, String> hashmap) {
	this.additionalPorperties = hashmap;
}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
}
