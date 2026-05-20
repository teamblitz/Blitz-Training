package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import frc.lib.BlitzSubsystem;

public class Motor extends BlitzSubsystem {
  private final MotorIO io;

  public Motor(MotorIO io) {
    super("intake");

    this.io = io;
  }

  @Override
  public void periodic() {
    super.periodic();
  }

  public Command forward() {
    return runEnd(() -> io.setSpeed(-0.1), () -> io.setSpeed(0));
  }

  public Command setSpeed(double speed) {
    return startEnd(() -> io.setSpeed(speed), () -> io.setSpeed(0));
  }
}
