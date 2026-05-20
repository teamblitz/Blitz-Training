package frc.robot.subsystems;

import static frc.robot.Constants.Motor.*;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

public class MotorIOKraken implements MotorIO {
  public final TalonFX kraken; 

  public MotorIOKraken() {
    kraken = new TalonFX(MOTOR_ID); // Sets the ID of the motor to the value of MOTOR_ID which is set in the Motor Constants.

    TalonFXConfiguration config = new TalonFXConfiguration();

    config.MotorOutput.withNeutralMode((NeutralModeValue.Brake)) // Creates a resistance in the motor when not running a command.
        .withInverted(
            INVERTED ? InvertedValue.Clockwise_Positive : InvertedValue.CounterClockwise_Positive); // Sets the forward direction of the motor.

    kraken.getConfigurator().apply(config); // Applys the declared configuration to the motor.
  }

  // Applys a varible speed to the motor
  @Override
  public void setSpeed(double speed) {
    kraken.set(speed);
  }

  // Logging
  @Override
  public void updateInputs(IntakeInputs inputs) {}
}
