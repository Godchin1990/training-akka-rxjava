package zuoyun.me.SPI;

import java.util.ServiceLoader;

/**
 * Created by ZuoYun on 1/8/16. Time: 9:09 AM Information:
 */

public class Main {

  public static void main(String[] args) {
    ServiceLoader<Command> loader = ServiceLoader.load(Command.class);
    for (Command command : loader) {
      command.execute();
    }
  }

}
