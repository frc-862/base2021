/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.lightning.LightningRobot;
import frc.lightning.LightningContainer;
import frc.robot.containers.TwikiContainer;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Robot extends LightningRobot {

    public Robot() { super(getRobot()); }

    private static LightningContainer getRobot() {
        if(isTwiki()) return new TwikiContainer();
        return null;
    }

    public static boolean isTwiki() {
        return Files.exists(Paths.get("/home/lvuser/twiki"));
    }

}
