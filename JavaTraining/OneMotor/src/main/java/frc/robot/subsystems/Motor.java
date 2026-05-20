package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import frc.lib.BlitzSubsystem;

public class Motor extends BlitzSubsystem {
  private final MotorIO io;

  public Motor(MotorIO io) {
    super("intake"); // Logs under "intake" in akit

    this.io = io;
  }

  @Override
  public void periodic() {
    super.periodic();
  }

  // Creates command for Talon to go at 10% speed.
  public Command forward() {
    return runEnd(() -> io.setSpeed(0.1), () -> io.setSpeed(0));
  }

  // Creates command for Talon to go at variable speed on the range of 0 <= y <= 1 
  public Command setSpeed(double speed) {
    return startEnd(() -> io.setSpeed(speed), () -> io.setSpeed(0));
  }
}
