package ru.netology.radio;

public class Radio {
    private final int firstStation = 0;
    private final int lastStation = 9;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentStation;
    private int currentVolume;
    public Radio() {
        this.currentStation = 10;
    }
    public Radio(int stationNumber) {
        this.currentStation = stationNumber;
    }
    public int getCurrentNumber() {
        return currentStation;
    }
    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < firstStation) {
            return;
        }
        if (newCurrentNumber > lastStation) {
            return;
        }
        currentStation = newCurrentNumber;
    }

    public void nextNumber() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = firstStation;
        }
    }

    public void prevNumber() {
        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}