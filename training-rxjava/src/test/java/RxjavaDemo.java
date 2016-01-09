import org.junit.Test;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by ZuoYun on 1/9/16. Time: 3:40 PM Information:
 */

public class RxjavaDemo {

  @Test
  public void method() {
    Observable<String> myObservable = Observable.create(
        new Observable.OnSubscribe<String>() {
          public void call(Subscriber<? super String> sub) {
            sub.onNext("Hello, world!");
            sub.onCompleted();
          }
        }
    );

    Subscriber<String> mySubscriber = new Subscriber<String>() {
      public void onNext(String s) {
        System.out.println(s);
      }

      public void onCompleted() {
      }

      public void onError(Throwable e) {
      }
    };

    myObservable.subscribe(mySubscriber);
    Observable<String> xxx = Observable.just("Hello, world!");


  }

  @Test
  public void method2() {
    Observable<String> myObservable = Observable.create(
        new Observable.OnSubscribe<String>() {
          public void call(Subscriber<? super String> sub) {
            sub.onNext("Hello, world!");
            sub.onCompleted();
          }
        }
    );

    Action1<String> onNextAction = new Action1<String>() {
      public void call(String s) {
        System.out.println(s);
      }
    };

    myObservable.subscribe(onNextAction);

  }

}
