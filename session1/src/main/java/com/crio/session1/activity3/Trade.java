
package com.crio.session1.activity3;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

// Another alternative is using @JsonAutoDetect
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Trade {
  
  private String symbol;
  private int quantity;
  private String purchaseDate;
  
  public Trade() {
  }
  
  public Trade(String symbol, int quantity, String purchaseDate) {
    this.symbol = symbol;
    this.quantity = quantity;
    this.purchaseDate = purchaseDate;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  @Override
  public String toString() {
    return "Trade [purchaseDate=" + purchaseDate + ", quantity=" + quantity + ", symbol=" + symbol + "]";
  }
}
