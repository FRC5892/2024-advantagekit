// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.SPI.Port;


/** Add your docs here. */
public class GyroIONavX implements GyroIO {
  AHRS navX = new AHRS(Port.kMXP);

  @Override
  public void updateInputs(GyroIOInputs inputs) {
    // TODO Auto-generated method stub
    inputs.connected = navX.isConnected();
    inputs.yawPosition = navX.getRotation2d();
    inputs.yawVelocityRadPerSec = 
  }
}
