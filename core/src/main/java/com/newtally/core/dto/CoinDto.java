package com.newtally.core.dto;

public class CoinDto {
	
	private String coinName;
    private String coinCode;
    private Double coinValue;
    private Long coinValueInCurrency;
	
    public String getCoinName() {
		return coinName;
	}
	
    public void setCoinName(String coinName) {
		this.coinName = coinName;
	}
	
    public String getCoinCode() {
		return coinCode;
	}
	
    public void setCoinCode(String coinCode) {
		this.coinCode = coinCode;
	}
	
    public Double getCoinValue() {
		return coinValue;
	}
	
    public void setCoinValue(Double coinValue) {
		this.coinValue = coinValue;
	}

	public Long getCoinValueInCurrency() {
		return coinValueInCurrency;
	}

	public void setCoinValueInCurrency(Long coinValueInCurrency) {
		this.coinValueInCurrency = coinValueInCurrency;
	}
}
