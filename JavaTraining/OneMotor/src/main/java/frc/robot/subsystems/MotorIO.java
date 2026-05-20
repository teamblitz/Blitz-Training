package frc.robot.subsystems;

import org.littletonrobotics.junction.AutoLog;

public interface MotorIO {

  @AutoLog
  public class IntakeInputs {
    public double rpm;
    public double current;
  }

  default void updateInputs(IntakeInputs inputs) {}

  default void setSpeed(double speed) {}
}
