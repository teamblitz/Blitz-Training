package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.OIConstants.Motor.*;
import frc.robot.subsystems.Motor;
import frc.robot.subsystems.MotorIOKraken;
import org.littletonrobotics.junction.networktables.LoggedDashboardChooser;

public class RobotContainer {

  private final Motor motor = new Motor(new MotorIOKraken());

  private final LoggedDashboardChooser<Command> autoChooser;

  public RobotContainer() {
    autoChooser = new LoggedDashboardChooser<>("Auto Choices");
    autoChooser.addDefaultOption("Do Nothing", Commands.none());

    configureButtonBindings();
  }

  private void configureButtonBindings() {
    OIConstants.Motor.FORWARD.whileTrue(motor.setSpeed(0.1));
  }

  public Command getAutonomousCommand() {
    return autoChooser.get();
  }
}
