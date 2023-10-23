package ru.netology.radio;

public class Radio {
    public int currentStation;
    public int firstStation = 0;
    public int lastStation = 9;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < firstStation) {
            return;
        }
        if (newStation > lastStation) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = firstStation;
        }

    }

    public void previosStation() {
        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }


}