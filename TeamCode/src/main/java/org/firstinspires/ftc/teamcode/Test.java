package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class Test extends LinearOpMode {
    VuMarkNav nav = new VuMarkNav(hardwareMap, telemetry);

    @Override
    public void runOpMode() {
        nav.activate();
        waitForStart();
        nav.deactivate();
    }
}
