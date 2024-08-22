import cv2
import numpy as np


minVal=10
maxVal=70
q1=25
q3=45
medianVal=30

offsethorizontal = 50
offsetVertical = 400
coefficent = 5

screen=np.zeros((500,500,3),dtype=np.uint8)+255

#sayı doğrusu çizgisi
cv2.line(screen,(offsethorizontal,offsetVertical),(450,offsetVertical),(0,0,0),2)

#min-q1 arası
cv2.line(screen,(offsethorizontal+minVal*coefficent,offsetVertical-50),(offsethorizontal+q1*coefficent,offsetVertical-50),(0,0,0),2)
#box
cv2.rectangle(screen, (offsethorizontal+q1*coefficent,offsetVertical-75),(offsethorizontal+q3*coefficent,offsetVertical-25),(0,0,0),2)
#median
cv2.line(screen,(offsethorizontal+medianVal*coefficent,offsetVertical-75),(offsethorizontal+medianVal*coefficent,offsetVertical-25),(0,0,255),2)
#q3-max
cv2.line(screen,(offsethorizontal+maxVal*coefficent,offsetVertical-50),(offsethorizontal+q3*coefficent,offsetVertical-50),(0,0,0),2)

cv2.imshow("Screen",screen)
cv2.waitKey(0)
cv2.destroyAllWindows()