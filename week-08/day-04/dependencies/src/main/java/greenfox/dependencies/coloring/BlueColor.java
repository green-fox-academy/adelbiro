package greenfox.dependencies.coloring;

import greenfox.dependencies.helloBeanWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  final Printer printer;

  @Autowired
  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("this is blue in color... ");
  }
}
