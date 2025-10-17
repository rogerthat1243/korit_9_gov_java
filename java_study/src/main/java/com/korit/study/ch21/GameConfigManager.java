package main.java.com.korit.study.ch21;

import java.util.Objects;

public class GameConfigManager {
    private static GameConfigManager instance; // 인스턴스 나중에 리턴할 그거
    private GameConfigManager() {} // 외부 객체 생성 막기 private

    public static GameConfigManager getInstance() { // 인스턴스 반환하는 거
        if (Objects.isNull(instance)) {
            instance = new GameConfigManager();
        }
        return instance;
    }

    private int soundVolume = 10;
    private String resolution = "1280x720";

    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        return String.format("Sound: %d, Resolution: %s", soundVolume, resolution);
    }
}