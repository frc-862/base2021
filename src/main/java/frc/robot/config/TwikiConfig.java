package frc.robot.config;

import frc.lightning.LightningConfig;

public class TwikiConfig extends LightningConfig {

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
        return 3.5d;
    }

    @Override
    public double getGearReduction() {
        return 15;
    }
    
}
