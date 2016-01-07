package zuoyun.me;


import org.junit.Test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import zuoyun.me.Hello.Greeter;

/**
 * Created by ZuoYun on 1/7/16. Time: 5:45 PM Information:
 */

public class HelloDemo {

  @Test
  public void method() {
    final ActorSystem system = ActorSystem.create("Garden");
    final ActorRef greet = system.actorOf(Props.create(Greeter.class), "greet");
    greet.tell(Greeter.Msg.GREET, greet);
  }

}
