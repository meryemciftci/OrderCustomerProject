# **Sipariş Yönetim Sistemi**: Müşteri Siparişlerinin Takip ve Yönetim API’leri 🚀

Sipariş yönetim sistemi, müşteri siparişlerinin girilebildiği ve takip edilebildiği API’ları sunan tamamlanmış bir sistemdir. Sistem, kullanıcıların müşteriler tanımlamasını, sipariş yetkisi vermesini ve siparişlerin kaydedilmesini sağlar. Proje Spring Boot kullanılarak geliştirilmiş olup, veri erişimlerinde Spring Data JPA kullanılmıştır. Veriler, MySQL veri tabanında saklanır ve tüm API’lar JSON veri tipi ile çalışır. Ayrıca, proje Docker Compose kullanılarak tek komutla çalıştırılabilir ve geliştirmeler için unit testler uygulanmıştır.

## 🎯 Servisler

Sistem, müşteri siparişlerinin kaydedilmesini ve yönetilmesini sağlayan iki farklı servisten oluşmaktadır:

### 1. **Customer Service**: 
- Müşteri oluşturma, güncelleme, silme ve arama API’larına sahip.
- Kullanıcılar, müşterilere yetki verebilmektedir.
- Yetkilendirilmiş kullanıcılar tarafından bir müşteri oluşturulup güncellenebilmektedir.

### 2. **Order Service**: 
- Sipariş oluşturma, güncelleme ve arama API’larına sahip.
- Siparişler, birden fazla ürünü içerebilmektedir.
- Her siparişin bağlı olduğu bir müşteri olacak.
- Bir müşteri, sadece yetkili olduğunda sipariş oluşturabilecek.
- Yetki olmadan ilgili müşteriye bağlı sipariş oluşturulamayacak.

## 📱 Kullanıcı Senaryoları

- **Müşteri Tanımlama ve Yetkilendirme:** Bir kullanıcı olarak müşteriler tanımlanabilir ve sipariş yetkisi verilebilmektedir.
- **Sipariş Kaydetme ve Güncelleme:** Bir kullanıcı olarak bir müşteri için sipariş kaydedebilir, siparişlerin listesini görebilir ve istediklerini güncelleyebilmektedir.

## 📊 Teknolojiler

- **Spring Boot:** Mikro hizmetler için uygulama geliştirme
- **Spring Data JPA:** Veri erişimi için
- **MySQL:** RDBMS veri tabanı
- **Docker Compose:** Uygulamaları tek komutla çalıştırmak için
- **Swagger:** API dökümantasyonu için
- **JSON:** API’ların veri tipi olarak çalıştığı format

## 🛠 Kullanım

1. Projeyi klonlayın:
   ```bash
   git clone https://github.com/kullaniciadi/proje-adi.git
   cd proje-adi
2. Gerekli bağımlılıkları yükleyin:
   ```bash
   docker-compose up -d
3. API’lere erişmek için Swagger kullanabilirsiniz.

## 📋 Teknik Beklentiler

- Uygulamalar **Spring Boot** kullanılarak geliştirilmiştir.
- **MySQL** veri tabanı kullanılmaktadır.
- Veri erişimlerinde **Spring Data JPA** kullanılmaktadır.
- Tüm API’lar **JSON** veri tipi ile çalışmaktadır.
- API’ların dökümantasyonu **Swagger** üzerinden sağlanmaktadır.
- Tüm uygulamalar **Docker Compose** kullanılarak tek komutla çalıştırılabilmektedir.
- Geliştirme süreçlerinde **unit testler** uygulanmıştır.



