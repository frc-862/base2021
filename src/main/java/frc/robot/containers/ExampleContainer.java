/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.containers;

import java.util.HashMap;
import java.util.List;

import edu.wpi.first.wpilibj2.command.Command;
import frc.lightning.LightningContainer;
import frc.lightning.auto.Path;
import frc.lightning.subsystems.LightningDrivetrain;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class ExampleContainer extends LightningContainer {

    public ExampleContainer() {
        super();
    }

    @Override
    public void configureButtonBindings() {
        // TODO Auto-generated method stub

    }

    @Override
    public void configureDefaultCommands() {
        // TODO Auto-generated method stub

    }

    @Override
    public void releaseDefaultCommands() {
        // TODO Auto-generated method stub

    }

    @Override
    public LightningDrivetrain getDrivetrain() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Path> getAutonomousPaths() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HashMap<String, Command> getAutonomousCommands() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void initializeDashboardCommands() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void configureSystemTests() {
        // TODO Auto-generated method stub

    }
}
