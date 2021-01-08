package frc.robot.subsystems.drivetrains;

import java.util.function.Supplier;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.geometry.Rotation2d;
import frc.lightning.subsystems.CTREDrivetrain;
import frc.lightning.subsystems.IMU.IMUFunction;
import frc.robot.Constants;

public class QuasarDrivetrain extends CTREDrivetrain {

    public QuasarDrivetrain(Supplier<Rotation2d> heading, IMUFunction zeroHeading) {
        super(new TalonFX(1), new TalonFX(4), new TalonFX[] { new TalonFX(2), new TalonFX(3) },
                new TalonFX[] { new TalonFX(5), new TalonFX(6) }, Constants.QUASAR, heading, zeroHeading);
        initMotorDirections();
    }

    @Override
    public void initMotorDirections() {
        getLeftMaster().setInverted(true);
        getRightMaster().setInverted(false);
        withEachLeftSlave((m) -> m.setInverted(false));
        withEachRightSlave((m) -> m.setInverted(true));
    }

}
