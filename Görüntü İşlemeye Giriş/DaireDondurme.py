import cv2
import numpy

def emptyy(x):
    pass

h=1
v=1


cv2.namedWindow("Screen")
cv2.createTrackbar("H","Screen",0,500,emptyy)
cv2.createTrackbar("V","Screen",0,500,emptyy)

while True:
    
    anamerkezx=0+h
    anamerkezy=0+v
    img = numpy.zeros((512,512,3),dtype=numpy.uint8)+255
    cv2.circle(img, ((anamerkezx),(anamerkezy)),50, (255,0,0),2)#Merkez
    cv2.circle(img, ((anamerkezx-50),(anamerkezy)),50, (255,0,0),2)#Sol
    cv2.circle(img, ((anamerkezx+50),(anamerkezy)),50, (255,0,0),2)#Sag
    cv2.circle(img, ((anamerkezx),(anamerkezy-50)),50, (255,0,0),2)#Ust
    cv2.circle(img, ((anamerkezx),(anamerkezy+50)),50, (255,0,0),2)#Alt
    cv2.imshow("Screen",img)
    if cv2.waitKey(1) & 0xFF == ord("q"):
        break
    h = cv2.getTrackbarPos("H","Screen")
  
    v = cv2.getTrackbarPos("V","Screen")

#cv2.waitKey(0)
cv2.destroyAllWindows()