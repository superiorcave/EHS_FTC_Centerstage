package org.firstinspires.ftc.teamcode.teleop;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Two Motor Test", group="Linear Opmode")
public class tenniiss extends LinearOpMode {
    // Declare OpMode members.
    private DcMotor motor1 = null;
    private DcMotor motor2 = null;

    @Override
    public void runOpMode() {
        // Initialize the hardware variables.
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");

        // Set the initial power for the motors to zero
        motor1.setPower(0);
        motor2.setPower(0);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // Set the motors to run at full power
            motor1.setPower(1.0);
            motor2.setPower(1.0);

            // Optionally, add some telemetry to monitor the motor power
            telemetry.addData("Motor1 Power", motor1.getPower());
            telemetry.addData("Motor2 Power", motor2.getPower());
            telemetry.update();

            // Just a small sleep to avoid busy looping
            sleep(50);
        }

        // Stop the motors when the OpMode ends
        motor1.setPower(0);
        motor2.setPower(0);
    }
}
