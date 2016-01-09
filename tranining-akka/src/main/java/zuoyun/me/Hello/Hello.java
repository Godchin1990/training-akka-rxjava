package zuoyun.me.Hello;


import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Created by ZuoYun on 1/7/16. Time: 5:35 PM Information:
 */

public class Hello extends UntypedActor {


  @Override
  public void preStart() {
    final ActorRef greeter =
        getContext().actorOf(Props.create(Greeter.class), "greeter");
    greeter.tell(Greeter.Msg.GREET, getSelf());
  }

  @Override
  public void onReceive(Object msg) {
    if (msg == Greeter.Msg.DONE) {
      getContext().stop(getSelf());
    } else {
      unhandled(msg);
    }
  }
}
