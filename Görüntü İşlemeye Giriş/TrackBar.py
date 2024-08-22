import cv2
import numpy

def emptyy(x):
    pass
cv2.namedWindow("Screen")
cv2.createTrackbar("F-size","Screen",25,250,emptyy)
fs=0.25
while True:
    img = numpy.zeros((512,512,3),dtype=numpy.uint8)+255
    cv2.putText(img,"Open-CV",(100,255),cv2.FONT_HERSHEY_COMPLEX,fs,(0,0,255),cv2.LINE_4)
    cv2.imshow("Screen",img)
    if cv2.waitKey(1) & 0xFF == ord("q"):
        break
    fs = cv2.getTrackbarPos("F-size","Screen")
    fs=fs/100
#cv2.waitKey(0)
cv2.destroyAllWindows()