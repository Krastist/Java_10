package ru.netologu.Radio;

public class Radio {
    private int quantityChannel = 10;
    private int minChannel = 0;
    private int maxChannnel = 9;
    private int currentChannel;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int quantityChannel) {
        this.quantityChannel = quantityChannel;
        this.maxChannnel = quantityChannel - 1;
    }

    public Radio() {
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getQuantityChannel() {
        return quantityChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getMaxChannnel() {
        return maxChannnel;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < getMinChannel()) {
            return;
        }
        if (newCurrentChannel > getMaxChannnel()) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void setToMaxChannel() {
        currentChannel = maxChannnel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < getMinVolume()) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > getMaxVolume()) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = getMaxVolume();
    }

    public void nextChannel() {
        if (currentChannel == getMaxChannnel()) {
            currentChannel = getMinChannel();
        } else {
            currentChannel = currentChannel + 1;
        }
    }

    public void prevChannel() {
        if (currentChannel == getMinChannel()) {
            currentChannel = getMaxChannnel();
        } else {
            currentChannel = currentChannel - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == getMaxVolume()) {
            currentVolume = getMaxVolume();
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == getMinVolume()) {
            currentVolume = getMinVolume();
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
