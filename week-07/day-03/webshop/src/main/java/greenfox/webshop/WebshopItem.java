package greenfox.webshop;

public class WebshopItem {
  String name;
  String description;
  int price;
  int quantity;

  public WebshopItem(String name, String description, int price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}


