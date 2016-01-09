package zuoyun.me;


import org.junit.Test;

import java.util.ServiceLoader;

import zuoyun.me.SPI.Command;

/**
 * Created by ZuoYun on 1/8/16. Time: 9:16 AM Information:
 */

public class SPIDemo {

  @Test
  public void method() {
    ServiceLoader<Command> loader = ServiceLoader.load(Command.class);
    for (Command command : loader) {
      command.execute();
    }
  }
}
