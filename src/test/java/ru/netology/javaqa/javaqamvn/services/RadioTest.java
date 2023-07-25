package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void SetCurrentStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(10);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);

        radio.setCurrentStation(48);

        int expected = 48;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation50() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(50);

        radio.setCurrentStation(49);

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationLowBorder() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationZero() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationOne() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationTen() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(10);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(67);

        int expected = 67;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMinZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAbove100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_CurrentStationEquals49() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_CurrentStationUp() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev_CurrentStationEquals49() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);

        radio.prev();

        int expected = 48;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prev_CurrentStationNotEquals0() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolumeOn1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(43);

        radio.increaseVolume();

        int expected = 44;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeOn101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeOn1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(43);
        radio.decreaseVolume();

        int expected = 42;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMyStation_ValidStation() {
        Radio radio = new Radio();
        radio.setOwnStation(5);


        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setMyStationNotValidStationMin1() {
        Radio radio = new Radio();
        radio.setOwnStation(-1);

        radio.setOwnStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setMyStation0() {
        Radio radio = new Radio();
        radio.setOwnStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMyStation1() {
        Radio radio = new Radio();
        radio.setOwnStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMyStation10() {
        Radio radio = new Radio();
        radio.setOwnStation(10);

        radio.setOwnStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMyStation9() {
        Radio radio = new Radio();
        radio.setOwnStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMyStation8() {
        Radio radio = new Radio();
        radio.setOwnStation(8);


        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void next_CurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_CurrentStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next_CurrentStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev_CurrentStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev_CurrentStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }
}
















