package jungmin.kdelivery;

public class Order {
  private String customerName;
  private String shopName;
  private String foodName;

  /**
  *@Order():주문 정보를 저장합니다.
  **/
  public Order(String customerName, String shopName, String foodName) {
    this.customerName = customerName;
    this.shopName = shopName;
    this.foodName = foodName;
  }



  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
}
