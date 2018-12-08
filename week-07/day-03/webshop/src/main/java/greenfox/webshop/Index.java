package greenfox.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class Index {
  List<WebshopItem> itemList;

  public Index() {
    WebshopRepository webshop = new WebshopRepository();
    itemList = webshop.getItemList();
  }

  @RequestMapping("/")
  public String listStock(Model model) {
    model.addAttribute("itemlist", itemList);
    return "index";
  }

  @RequestMapping("/cheapest-first")
  public String orderByPrice(Model model) {
    model.addAttribute("itemlist", itemList
        .stream()
        .sorted(Comparator.comparing(WebshopItem::getPrice))
        .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping("/only-available")
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
  public String listMostExpensiveAvailable(Model model) {
    model.addAttribute("itemlist", itemList
        .stream()
        .filter(WebshopItem -> WebshopItem.getQuantity() > 0)
        .max(Comparator.comparing(WebshopItem::getPrice))
        .get());
    return "index";
  }
  @RequestMapping("/averagestock")
  public String averageStock(Model model) {
    double avg = 0;
    for (WebshopItem item : itemList) {
      avg += item.getQuantity();
    }
    avg = avg/itemList.size();
    model.addAttribute("average", avg);
    return "simple";
  }
}
