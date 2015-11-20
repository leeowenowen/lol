package lol.owo.com.lol.net;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by wangli on 11/18/15.
 */
public class TCPClient {

  public static void start() {
    try {
      Socket s = new Socket("localhost", 5000);
      // outgoing stream redirect to socket
      OutputStream out = s.getOutputStream();
      // 注意第二个参数据为true将会自动flush，否则需要需要手动操作out.flush()
      PrintWriter output = new PrintWriter(out, true);
      output.println("{\"abc\":\"def\"");
      BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
      // read line(s)
      String message = input.readLine();
      Log.d("Tcp Demo", "message From Server:" + message);
      s.close();

    } catch (UnknownHostException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
