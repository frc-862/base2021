/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;

public class Core extends SubsystemBase {
    private final String name = "CORE";

    // PowerDistributionPanel pdp = new PowerDistributionPanel(0);
    Compressor compressor;
    // PigeonIMU pigeonIMU bird;
    AHRS navx;

    private double[] ypr = new double[3];

    public Core() {
        setName(name);
        compressor = new Compressor(RobotMap.COMPRESSOR_ID);
        navx = new AHRS(SPI.Port.kMXP);
    }

    @Override
    public void periodic() {
        // bird.getYawPitchRoll(ypr);
    }

    public Rotation2d getHeading() { 
        // return Rotation2d.fromDegrees((((ypr[0]+180)%360)-180));
        return Rotation2d.fromDegrees(-navx.getAngle()); 
    }

    public int resetHeading() {
        navx.reset();
        // bird.setYaw(0d);
        return 0;
    }

    public void enableComperser(){
        compressor.enabled();
    }

}