Merhaba,

1- Lütfen application.properties içerisindeki postgresql datasource ayarlarını yapınız. (Bendeki databse : projectmanagement)
2-ProjectManagerApplication Main Class'taki test kayıtlarını oluşturacak olan repositoryPopulator methodunu aktifleştirin. 
Ve projeyi 1 defa ayağa kaldırın ardından ilgili methodu kapatabilirsiniz. 





REST APİ TEST İÇİN;

Tüm veriyi pageable şekilde listelemek için (GET):
APİ PATH : http://localhost:8000/api/projects/pagination


Databasedeki tekil proje verisini çekmek için  ; 
YAPILMASI GEREKEN İSTEK : (GET)
DİNLENEN APİ PATH: http://localhost:8000/api/projects/1

Proje Verisi eklemek için;
YAPILMASI GEREKEN İSTEK : (POST)
DİNLENEN APİ PATH: http://localhost:8000/api/projects
Gerekli json body formatı : 
{
    "projectName":"deneme",
    "projectCode":"deneme13",
      "managerId":"7"
}

Silme işlemi için yapılan istek (DELETE):
YAPILMASI GEREKEN İSTEK : (DELETE)
DİNLENEN APİ PATH: http://localhost:8000/api/projects/1  


Güncelleme işlemi için :
YAPILMASI GEREKEN İSTEK : (PUT)
DİNLENEN APİ PATH: http://localhost:8000/api/projects/2

Gerekli Json Format:
{
    "projectName":"deneme",
    "projectCode":"deneme132"
}