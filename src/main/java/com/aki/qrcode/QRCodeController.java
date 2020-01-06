package com.aki.qrcode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * 二维码生成类
 */
@Controller
public class QRCodeController {

    @RequestMapping("/createQrCode")
    public void createQrCode(String msg, HttpServletResponse response) {
        if (msg == null || msg.isEmpty()) msg = "啥也没写";
        try {
            QrCodeUtils.encode(msg, null, response.getOutputStream(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}