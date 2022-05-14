package com.example.design_mvc;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        new Thread() {
            @Override
            public void run() {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://github.com/AFinalStone/Android0703_Gradle_JiaGu/blob/main/raw/test.json").openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.connect();
                    int code = httpURLConnection.getResponseCode();
                    if (code == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        byte[] buffer = new byte[1024];
                        ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream();
                        int length = -1;
                        while ((length = inputStream.read(buffer)) != -1) {
                            byteArrayInputStream.write(buffer, 0, length);
                        }
                        String response = byteArrayInputStream.toString();
                        System.out.println(response);
                    }
                    httpURLConnection.disconnect();
                    System.out.println("网络请求成功了");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("网络请求失败了");
                }
            }
        }.start();
    }
}