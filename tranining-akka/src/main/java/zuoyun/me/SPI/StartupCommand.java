package zuoyun.me.SPI;


/**
 * Created by ZuoYun on 1/8/16. Time: 9:12 AM Information:
 */

public class StartupCommand implements Command {

  public void execute() {
    System.out.println("startup");
  }
}
