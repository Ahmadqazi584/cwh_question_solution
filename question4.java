package com.company;
interface TvRemote{
    public void turnOn();
    public void channelsNumber();
}
interface SmartTvRemote extends TvRemote{
    public void WiFi();
    public void USB();
    public void Youtube();
}
class TV implements SmartTvRemote{
    @Override
    public void turnOn() {
        System.out.println("Opening TV by remote...");
    }

    @Override
    public void WiFi() {
        System.out.println("Wifi is connecting...");
    }

    @Override
    public void USB() {
        System.out.println("USB is not added...");
    }

    @Override
    public void Youtube() {
        System.out.println("Opening youtube vedios...");
    }

    @Override
    public void channelsNumber() {
        System.out.println("48 channels & other smart features...");
    }
}
public class question4  {
    public static void main(String[] args) {
        TV smart = new TV();
        smart.turnOn();
        smart.channelsNumber();
        smart.USB();
        smart.WiFi();
        smart.Youtube();
    }
}
