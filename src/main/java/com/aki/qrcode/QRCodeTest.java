package com.aki.qrcode;

import java.awt.image.BufferedImage;

public class QRCodeTest {
    public static void main(String[] args) {
        try {
            QrCodeUtils.encode("adsadsdsa",null,"d:/",false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
