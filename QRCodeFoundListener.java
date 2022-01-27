package com.example.qrcodescanner2;

public interface QRCodeFoundListener
{
    void onQRCodeFound(String qrCode);
    void qrCodeNotFound();
}
