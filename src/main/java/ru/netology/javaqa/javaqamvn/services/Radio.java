package ru.netology.javaqa.javaqamvn.services;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int radioStations) {

        this.maxStation = radioStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minStation) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void setOwnStation(int station) {
        if (station >= minStation) {
            if (station <= maxStation) {
                currentStation = station;
            }
        }
    }
}


