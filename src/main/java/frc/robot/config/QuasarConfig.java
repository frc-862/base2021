package frc.robot.config;

import frc.lightning.LightningConfig;

public class QuasarConfig extends LightningConfig {

    @Override
    public double getTicsPerRev() {
        return 2048d; // TODO verify
    }

    @Override
    public double getMaxRPM() {
        return 5700d; // TODO verify
    }

    @Override
    public double getWheelDiameterInches() {
        return 6d; // TODO verify
    }

    @Override
    public double getGearReduction() {
        return 15; // TODO verify
    }
}
