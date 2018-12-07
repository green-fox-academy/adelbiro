package greenfox.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.stream.Collectors;

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
    itemList.add(new WebshopItem("something nike", "for testing purposes", 10, 12));
  }

  @RequestMapping("/")
  public String listStock(Model model) {
    model.addAttribute("itemlist", itemList);
    return "index";
  }

  @RequestMapping("/orderbyprice")
  public String orderByPrice(Model model) {
    model.addAttribute("itemlist", itemList
        .stream()
        .sorted(Comparator.comparing(WebshopItem::getPrice))
        .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping("/available")
  public String listAvailableStock(Model model) {
    List<WebshopItem> availableList = new ArrayList<>();
    for (WebshopItem item : itemList) {
      if (item.getQuantity() > 0) {
        availableList.add(item);
      }
    }
    model.addAttribute("itemlist", availableList);
    return "index";
  }

  @RequestMapping("/nike")
  public String listNike(Model model) {
    ArrayList<WebshopItem> nikeList = new ArrayList<>();
    for (WebshopItem item : itemList) {
      if (item.getDescription().toLowerCase().contains("nike") || item.getName().toLowerCase().contains("nike")) {
        nikeList.add(item);
      }
    }
    model.addAttribute("itemlist", nikeList);
    return "index";
  }

  @RequestMapping("/mostexpensive")
  public String listMostExpensiveAvailable() {
    return "index";
  }
}
