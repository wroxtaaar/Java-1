
package com.crio.session1.activity2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trade {
  
  @JsonProperty("1. symbol")
  public String symbol;
  @JsonProperty( "2. quantity")
  public int quantity;
  @JsonProperty("3. purchaseDate")
  public String purchaseDate;
  
  public Trade() {
  }
  
  public Trade(String symbol, int quantity, String purchaseDate) {
    this.symbol = symbol;
    this.quantity = quantity;
    this.purchaseDate = purchaseDate;
  }

  @Override
  public String toString() {
    return "Trade [purchaseDate=" + purchaseDate + ", quantity=" + quantity + ", symbol=" + symbol + "]";
  }
}