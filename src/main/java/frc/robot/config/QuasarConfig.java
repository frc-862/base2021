package frc.robot.config;

import frc.lightning.LightningConfig;

public class QuasarConfig extends LightningConfig {

    @Override
    public double getTicsPerRev() {
        return 2048d;
    }

    @Override
    public double getMaxRPM() {
        return 5700d;
    }

    @Override
    public double getWheelDiameterInches() {
        return 6.16d;
    }

    @Override
    public double getGearRatio() {
        return 15; // 15:1
    }

    @Override
    public double getTicsPerRevWheel() {
        return (getTicsPerRev() * getGearRatio());
    }
}
