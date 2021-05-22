package org.jdkstack.jdkagent.examples;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;

/**
 * 例子.
 *
 * @author Admin
 */
public final class Examples {

  private Examples() {
    //
  }

  /**
   * This is a method description.
   *
   * @param args 入口方法参数传递.
   * @author Admin
   */
  public static void main(final String[] args) {
    try {
      Examples.noFail(() -> InetAddress.getByName("www.google.com"));
    } catch (final Exception e) {
      e.printStackTrace();
    }
    try {
      Examples.noFail(() -> new Socket("www.google.con", 80));
    } catch (final Exception e) {
      e.printStackTrace();
    }

    try {
      Examples.noFail(() -> new ServerSocket(8080));
    } catch (final Exception e) {
      e.printStackTrace();
    }

    try {
      Examples.noFail(
          () -> {
            final DatagramSocket udpSocket = new DatagramSocket();
            udpSocket.connect(new InetSocketAddress("www.google.com", 80));
            return udpSocket;
          });
    } catch (final Exception e) {
      e.printStackTrace();
    }
    try {
      Thread.sleep(9999999);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static <T> T noFail(final Callable<T> action) throws Exception {
    Thread.sleep(2000);
    return action.call();
  }
}
