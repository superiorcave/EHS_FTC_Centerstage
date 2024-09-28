package org.firstinspires.ftc.teamcode.modules;

import org.opencv.core.Mat;
import org.openftc.easyopencv.OpenCvPipeline;

public class cameratest extends OpenCvPipeline {
    @Override
    public void init(Mat input){
        //exucted before first call to processFrame
    }
    public Mat processFrame(Mat input){
        //Executed everytime a new frame is dispatched

        return input;//Return the image that will be displayed
        //(in this case the input mat directly)
    }

    @Override
    public void onViewportTapped(){
        // Executed when the image display is clicked by the mouse or tapped
        // This method is executed from the UI thread, so be careful to not
        // perform any sort heavy processing here! Your app might hang otherwise
    }
}