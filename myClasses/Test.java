// This is an example of how a TeleOp program will look with our robot

// loads software tools for programming the robot from Qualcomm Robot Core SDK
// Allows us to use build in methods and classes without building them
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

// imported code from TestBench.java program
import org.firstinspires.ftc.teamcode.mechanisms.H_TouchSensor_TestBench;
import org.firstinspires.ftc.teamcode.mechanisms.I_DCMotor_TestBench;

@TeleOp //Makes sure the Control Hub knows this is for a TeleOp program
public class I_DcMotor extends OpMode {
    H_TouchSensor_TestBench benchTouchSensor = new H_TouchSensor_TestBench();
    I_DCMotor_TestBench benchMotor = new I_DCMotor_TestBench();
    @Override
    public void init() {
        benchMotor.init(hardwareMap);
    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;
        benchMotor.setMotorSpeed(motorSpeed);
        /*
        if(benchTouchSensor.getTouchSensorState()){
            benchMotor.setMotorSpeed(0.5);
        } else {
            benchMotor.setMotorSpeed(0);
        }
         */

        if(gamepad1.a){
            benchMotor.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b)
        {
            benchMotor.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }
        telemetry.addData("Motor Revs", benchMotor.getMotorRevs());
    }
}
