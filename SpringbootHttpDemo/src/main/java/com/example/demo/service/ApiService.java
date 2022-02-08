package com.example.demo.service;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.parameter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import static java.lang.System.out;

@Service
public class ApiService {

    public ByteArrayOutputStream find(String city) throws Exception {
        URL u = new URL(" http://api.k780.com/?app=weather.realtime&cityNm=" + String.valueOf(city) + "&ag=today,futureDay,lifeIndex,futureHour&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");
        InputStream in = u.openStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            byte[] buf = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }

        System.out.println(out);
        return out;

    }
}
