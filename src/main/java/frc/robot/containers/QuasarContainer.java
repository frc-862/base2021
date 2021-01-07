package frc.robot.containers;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.lightning.LightningConfig;
import frc.lightning.LightningContainer;
import frc.lightning.subsystems.DrivetrainLogger;
import frc.lightning.subsystems.LightningDrivetrain;
import frc.lightning.subsystems.SmartDashDrivetrain;
import frc.robot.JoystickConstants;
import frc.robot.commands.TestTankDrive;
import frc.robot.config.QuasarConfig;
import frc.robot.subsystems.drivetrains.QuasarDrivetrain;

public class QuasarContainer extends LightningContainer {

    private static final LightningConfig config = new QuasarConfig();

	private static final QuasarDrivetrain drivetrain = new QuasarDrivetrain();//QuasarDrivetrain.create();
	//private static final DrivetrainLogger drivetrainLogger = new DrivetrainLogger(drivetrain);
	//private static final SmartDashDrivetrain smartDashDrivetrain = new SmartDashDrivetrain(drivetrain);

	private static final XboxController driver = new XboxController(JoystickConstants.DRIVER);
	private static final XboxController operator = new XboxController(JoystickConstants.OPERATOR);

	/**
	 * The container for the robot. Contains subsystems, OI devices, and commands.
	 */
	public QuasarContainer() {
		super();
	}

    @Override
    protected void configureButtonBindings() {

    }

    @Override
    protected void configureSystemTests() {

    }

    @Override
    protected void configureDefaultCommands() {
        drivetrain.setDefaultCommand(new TestTankDrive(drivetrain, () -> -driver.getY(GenericHID.Hand.kLeft), () -> -driver.getY(GenericHID.Hand.kRight)));
    }

    @Override
    protected void releaseDefaultCommands() {

    }

    @Override
    protected void initializeDashboardCommands() {

    }

    @Override
    protected void configureAutonomousCommands() {

    }

    @Override
    public LightningConfig getConfig() { return config; }

    @Override
    public LightningDrivetrain getDrivetrain() { return null; }
    
}
