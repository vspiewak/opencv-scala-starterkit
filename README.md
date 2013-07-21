OpenCV Scala StarterKit
=======================

This is a minimal Scala project using OpenCV.
OpenCV is provided as a static library.


Run on Linux:

    sbt -Djava.library.path=lib/linux run

Run on OSX:

    sbt -Djava.library.path=lib/osx run

Run on Windows (You must compile *first* OpenCV into lib/win):

    sbt -Djava.library.path=lib/win run

Related links:
* http://experienceopencv.blogspot.fr/2011/02/cascade-classifier-and-face-detection.html
* http://note.sonots.com/SciSoftware/haartraining.html
* http://docs.opencv.org/doc/user_guide/ug_traincascade.html
* http://opencvuser.blogspot.fr/2011/08/creating-haar-cascade-classifier-aka.html
* http://blog.csdn.net/caiye917015406/article/details/8558792
