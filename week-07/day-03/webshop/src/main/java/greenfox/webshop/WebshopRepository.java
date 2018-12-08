package greenfox.webshop;

import java.util.ArrayList;
import java.util.List;

public class WebshopRepository {
  private List<WebshopItem> itemList;

  public WebshopRepository() {
    WebshopItem coke = new WebshopItem("Coca cola", "0.5l standard coke", 25, 0);
    WebshopItem printer = new WebshopItem("Printer",
        "Some HP printer that will print pages", 3000, 0);
    WebshopItem runningShoes = new WebshopItem("Running shoes",
        "Nike running shoes for everyday sport", 1000, 5);
    itemList = new ArrayList<>();
    itemList.add(coke);
    itemList.add(printer);
    itemList.add(runningShoes);
    itemList.add(new WebshopItem("something nike", "For testing purposes", 10, 12));
    itemList.add(new WebshopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    itemList.add(new WebshopItem("WOKIN", "Chicken with fried rice and WOKIN sauce", 119, 100));
  }

  public List<WebshopItem> getItemList() {
    return itemList;
  }
}
