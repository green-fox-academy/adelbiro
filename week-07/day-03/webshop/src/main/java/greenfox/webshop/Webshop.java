package greenfox.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Webshop {
  List<WebshopItem> itemList;

  public Webshop() {
    WebshopItem coke = new WebshopItem("Coca cola", "0.5l standard coke", 25, 0);
    WebshopItem printer = new WebshopItem("Printer",
        "Some HP printer that will print pages", 3000, 2);
    WebshopItem runningShoes = new WebshopItem("Running shoes",
        "Nike running shoes for everyday sport", 1000, 5);
    itemList = new ArrayList<>();
    itemList.add(coke);
    itemList.add(printer);
    itemList.add(runningShoes);
  }

  @RequestMapping("/")
  public String listStock(Model model) {
    Webshop webshop = new Webshop();
    model.addAttribute("itemlist", webshop.itemList);
    return "index";
  }

  @RequestMapping("/orderbyprice")
  public String orderByPrice() {
    return "index";
  }

  @RequestMapping("/available")
  public String listAvailableStock() {
    return "index";
  }

  @RequestMapping("/nike")
  public String listNike() {
    return "index";
  }

  @RequestMapping("/mostexpensive")
  public String listMostExpensiveAvailable() {
    return "index";
  }

}
