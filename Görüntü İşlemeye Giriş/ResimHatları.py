import cv2
import matplotlib.pyplot as plt
import numpy as np

"""
# kenar tespiti

img = cv2.imread("a.jpg")
edges=cv2.Canny(img,1,150) #değeri düşürürsek görüntünün tümünü kenar olarak tespit edecektir.
cv2.imshow("1.durum",img)
cv2.imshow("2.durum",edges)
cv2.waitKey(0)
cv2.destroyAllWindows()

"""

"""

# görüntü eşikleme

img= cv2.imread("m43.jpg")
resource, threshImg =cv2.threshold(img,80,255,cv2.THRESH_BINARY)
cv2.imshow("1.hal",img)
cv2.imshow("2.hal",threshImg)
cv2.waitKey(0)
cv2.destroyAllWindows()

"""

"""

img = cv2.imread("a.jpg")
imgGray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
imgHsv = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)

plt.subplot(131), plt.imshow(img, cmap="gray"), plt.title("orijinal")
plt.subplot(132), plt.imshow(imgGray, cmap="gray"), plt.title("Gray")
plt.subplot(133), plt.imshow(imgHsv, cmap="gray"), plt.title("HSV")

plt.show()


plt.show()

"""

# dış hat bulma
img = cv2.imread("m43.jpg")
imgGray=cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
res, imgThreshold=cv2.threshold(img,125,255,cv2.THRESH_BINARY)
cv2.waitKey(0)
cv2.destroyAllWindows()
cntrs, res= cv2.findContours(imgThreshold,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE) #görüntü dış çerçevisini de kontür olarak alıyor
print(len(cntrs))
cv2.drawContours(img,cntrs,-1,(0,0,255),1)
cv2.imshow("Image",)
cv2.waitKey(0)
cv2.destroyAllWindows()
