
# HTTP Anatomisi

## HTTP İstek Yapısı (HTTP Request)
HTTP (HyperText Transfer Protocol), web üzerinde veri iletişimi için kullanılan uygulama katmanı protokolüdür. Üç ana bölümden oluşur:

### 1.) Başlangıç Satırı (Start Line)
İsteğin ne olduğunu belirten satırdır. Üç öğe içerir:

 - Method (Metot): Eylemi belirtir (GET, POST, PUT, DELETE vb.).

 - Target (Hedef): İstenen kaynağın URL'si veya yolu (Örn: /index.html).

 - HTTP Version: Kullanılan protokol sürümü (Örn: HTTP/1.1).

Örnek: GET /user/profile HTTP/1.1


### 2.) İstek Üstbilgileri (Request Headers)
Sunucuya istek hakkında ek bilgi sağlayan anahtar-değer çiftleridir.

 - Host: Sunucunun alan adı.

 - User-Agent: İsteği yapan tarayıcı bilgisi.

 - Accept: İstemcinin kabul edebileceği içerik türleri (JSON, HTML vb.).



### 3.)  Gövde (Body) - Opsiyonel
Sunucuya gönderilen veriyi içerir. Genellikle POST veya PUT isteklerinde (form verileri veya JSON dosyaları için) kullanılır.



## HTTP Yanıt Yapısı (HTTP Response)
Sunucunun istemciye verdiği cevaptır.


### 1.) Durum Satırı (Status Line)
İsteğin sonucunu özetler:

 - HTTP Version: Protokol sürümü.

 - Status Code (Durum Kodu): İşlemin başarısını temsil eden sayısal kod (Örn: 200).

 - Status Text: Kodun kısa açıklaması (Örn: OK).

Örnek: HTTP/1.1 200 OK


### 2.) Yanıt Üstbilgileri (Response Headers)
Sunucu ve gönderilen içerik hakkında bilgi verir.

 - Content-Type: Gövdedeki verinin türü (Örn: text/html).

 - Content-Length: Gövdenin boyutu.

 - Server: Sunucu yazılımının adı.



### 3.) Gövde (Body) 
İstemcinin talep ettiği asıl içeriktir. Bu bir HTML belgesi, bir resim dosyası veya JSON verisi olabilir.

### Status Line
```
HTTP/1.1 200 OK
```
- **2xx**: Başarılı
- **3xx**: Yönlendirme
- **4xx**: İstemci hatası
- **5xx**: Sunucu hatası


## Yaygın HTTP Metodları

| Metod | Amaç |
|-------|------|
| GET | Veri almak |
| POST | Veri oluşturmak |
| PUT | Veri güncellemek |
| DELETE | Veri silmek |
| PATCH | Kısmi güncelleme |
