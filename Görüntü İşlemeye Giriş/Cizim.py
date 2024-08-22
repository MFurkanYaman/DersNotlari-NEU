import cv2
import numpy

#Sahne oluşturma
screen =numpy.zeros((512,512,3),dtype=numpy.unit8)#Siyah sahne oluşturur zeros.
screen =numpy.zeros((512,512,3),dtype=numpy.unit8)+255#Beyaz yapar.
#print(screen)

"""
#Line
cv2.line(screen, (20,20), (20,220), (100,100,100), thickness=2)#Nereye, başlangıç,bitiş,renk(bgr),kalınlık.
cv2.line(screen,(25,100), (100,255), (11,123,131), 3)
"""

"""
#Dörtgen
cv2.rectangle(screen, (10,10), (125,125), (0,0,255),3)
cv2.rectangle(screen, (10,10), (125,125), (0,0,255),-1)#Dolu oluması için tickness=-1
"""

"""
#Circle
cv2.circle(screen, (260,260),50, (255,0,0),-1)#Dolu oluması için tickness=-
cv2.circle(screen, (260,260),50, (255,0,0),2)#Nereye,merkez,r,renk,kalınlık.
"""

"""
#Ellipse
cv2.ellipse(screen, (250,400), (50,20), 45,0,270,(255,0,0),3)#Nereye, merkez, (r,r), açı, başlangıç açı,bitiş açı,renk,tickness.
"""

"""
#Üçgen
x=(255,50)
y=(200,150)
z=(300,150)
cv2.line(screen,x,y,(0,0,255),2)
cv2.line(screen,y,z,(0,0,255),2)
cv2.line(screen,z,x,(0,0,255),2)
"""
"""
#Çokgen
points=numpy.array(([50,350],[100,350],[125,375],[75,400]),numpy.int32)#Noktaları belirleme.
cv2.polylines(screen,[points],False,(0,255,0),2)#Nereye,Noktalar,kapalımı?,renk,kalınlık.
"""

"""
#Yazi yazma
cv2.putText(screen, "Goruntu isleme",(50,500),cv2.FONT_HERSHEY_SIMPLEX,1,(0,0,255),cv2.LINE_4)#Nereye,ney,sol-alt,font(sayisal olur),boyut,renk,çizgi tipi(sayisal olur).
"""

cv2.imshow("Screen",screen)
cv2.waitKey(0)
cv2.destroyAllWindows()


