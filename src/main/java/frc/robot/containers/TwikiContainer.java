package frc.robot.containers;

import java.util.HashMap;
import java.util.List;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.lightning.LightningConfig;
import frc.lightning.LightningContainer;
import frc.lightning.auto.Autonomous;
import frc.lightning.auto.Path;
import frc.lightning.commands.VoltDrive;
import frc.lightning.subsystems.DrivetrainLogger;
import frc.lightning.subsystems.LightningDrivetrain;
import frc.lightning.subsystems.SmartDashDrivetrain;
import frc.lightning.testing.SystemTest;
import frc.robot.JoystickConstants;
import frc.robot.Robot;
import frc.robot.commands.auto.SpinAuto;
import frc.robot.config.TwikiConfig;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.drivetrains.TwikiDrivetrain;
import frc.robot.systemtests.drivetrain.LeftSideMoves;
import frc.robot.systemtests.drivetrain.RightSideMoves;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class TwikiContainer extends LightningContainer {

	private static final LightningConfig config = new TwikiConfig();

	private static final LightningDrivetrain drivetrain = new TwikiDrivetrain();
	private static final DrivetrainLogger drivetrainLogger = new DrivetrainLogger(drivetrain);
	private static final SmartDashDrivetrain smartDashDrivetrain = new SmartDashDrivetrain(drivetrain);

	private static final XboxController driver = new XboxController(JoystickConstants.DRIVER);
	private static final XboxController operator = new XboxController(JoystickConstants.OPERATOR);

	/**
	 * The container for the robot. Contains subsystems, OI devices, and commands.
	 */
	public TwikiContainer() {
		super();
	}

	@Override
	protected void configureSystemTests() {
		SystemTest.register(new LeftSideMoves(drivetrain));
		SystemTest.register(new RightSideMoves(drivetrain));
	}

	@Override
	protected void configureDefaultCommands() {
		drivetrain.setDefaultCommand(new VoltDrive(drivetrain, () -> -driver.getY(GenericHID.Hand.kLeft), () -> -driver.getY(GenericHID.Hand.kRight)));
	}

	@Override
	protected void releaseDefaultCommands() {
		drivetrain.setDefaultCommand(new RunCommand(() -> {}, drivetrain));
	}

	@Override
	public void initializeDashboardCommands() {
		// SmartDashboard.putData("Simple Path",
		// TwikiPathGenerator.generateRamseteCommand(drivetrain,
		// TwikiPathGenerator.Paths.TEST_PATH));
		// SmartDashboard.putData("Stop", new InstantCommand(() -> drivetrain.stop(), drivetrain));
		// SmartDashboard.putData("Unfollow", new InstantCommand(() -> drivetrain.unfollow(), drivetrain));

	}

	@Override
	public void configureButtonBindings() {
	}

	@Override
	public LightningDrivetrain getDrivetrain() {
		return drivetrain;
	}

	@Override
	protected void configureAutonomousCommands() {
		Autonomous.register("Spin Auto", new SpinAuto(drivetrain));
	}

	@Override
	public LightningConfig getConfig() {
		return config;
	}

}