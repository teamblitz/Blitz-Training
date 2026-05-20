package frc.robot.subsystems;

import static frc.robot.Constants.Intake.*;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

public class MotorIOKraken implements MotorIO {
  public final TalonFX grabball;

  public MotorIOKraken() {
    grabball = new TalonFX(INTAKE_ID); // TODO SET VALUE

    TalonFXConfiguration config = new TalonFXConfiguration();

    config.CurrentLimits.withStatorCurrentLimit(CURRENT_LIMIT);

    config.MotorOutput.withNeutralMode((NeutralModeValue.Brake))
        .withInverted(
            INVERTED ? InvertedValue.Clockwise_Positive : InvertedValue.CounterClockwise_Positive);

    grabball.getConfigurator().apply(config);
  }

  @Override
  public void setSpeed(double speed) {
    grabball.set(speed);
  }

  @Override
  public void updateInputs(IntakeInputs inputs) {}
}
