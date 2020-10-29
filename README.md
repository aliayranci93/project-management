Merhaba,

1- Lütfen application.properties içerisindeki postgresql datasource ayarlarını yapınız.
2-ProjectManagerApplication Main Class'taki test kayıtlarını oluşturacak olan  repositoryPopulator methodunu aktifleştirin. 
Ve projeyi 1 defa ayağa kaldırın ardından ilgili methodu kapatabilirsiniz. 






Rest Api test için;

Tüm veriyi listelemek için (GET):
http://localhost:8000/api/projects/pagination


Databasedeki tekil proje verisini çekmek için (GET) ; 
Kullandığınız Rest Api Test Uygulamasına girilecek Url: http://localhost:8000/api/projects/1

Proje Verisi eklemek için (POST);
İstek atılacak path : http://localhost:8000/api/projects
Gerekli json body formatı : 
{
    "projectName":"deneme",
    "projectCode":"deneme13",
      "managerId":"7"
}

Silme işlemi için yapılan istek (DELETE):
http://localhost:8000/api/projects/1  


Güncelleme işlemi için (PUT) :

http://localhost:8000/api/projects/2

Gerekli Json Format:
{
    "projectName":"deneme",
    "projectCode":"deneme132"
}