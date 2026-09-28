package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class I_DCMotor_TestBench {
    private DcMotor motor;
    private double ticksPerRev;
    public void init(HardwareMap hwMap){
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setMotorSpeed(double speed){
        motor.setPower(speed);
    }

    public double getMotorRevs(){
        return motor.getCurrentPosition() / ticksPerRev;
    }

    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroBehavior){
        motor.setZeroPowerBehavior(zeroBehavior);
    }
}
