import cv2

movie = cv2.VideoCapture("dadsa.mp4")#Laptop kamnera 0, Takılı kamera 1.0 için (0,cv2.CAP_DSHOW) yapılırsa hata varsa çözülür.

while True:
    state,frame = movie.read()#Süresi varsa state kullanılır.
    if state==0:
        break
    frame=cv2.resize(frame,(480,480))#Pencere boyutunu ayarlar.
    cv2.imshow("pencere adi",frame)
    if cv2.waitKey(33) & 0xFF == ord("q"):
        break

movie.release()
cv2.destroyAlWindows()
