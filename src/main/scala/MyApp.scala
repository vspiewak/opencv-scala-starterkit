import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.core.Scalar;

object MyApp extends App {

  System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
  println(String.format("Loaded OpenCV %s", Core.VERSION))
  
  val m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
  println(String.format("Mat: %s", m));
  
  val mrow = m.row(1);
  mrow.setTo(new Scalar(1))

  val mcol = m.col(5);
  mcol.setTo(new Scalar(5))

  println(String.format("Mat data: %s", m.dump))

}

