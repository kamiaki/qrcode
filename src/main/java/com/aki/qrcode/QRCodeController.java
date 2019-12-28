package com.aki.qrcode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * 二维码生成类
 */
@Controller
public class QRCodeController {

    @RequestMapping("/createQrCode")
    public void createQrCode(HttpServletRequest request, HttpServletResponse response) {
        StringBuffer url = request.getRequestURL();
        try {
            OutputStream os = response.getOutputStream();
            //从配置文件读取需要生成二维码的连接
//            String requestUrl = GraphUtils.getProperties("requestUrl");
            //requestUrl:需要生成二维码的连接，logoPath：内嵌图片的路径，os：响应输出流，needCompress:是否压缩内嵌的图片
            QrCodeUtils.encode("一段测试文字", null, os, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}