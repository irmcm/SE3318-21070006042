# Eldoria Game

Eldoria Game, fantastik bir dünyada geçen maceraları konu alan ve Java ile Maven kullanılarak geliştirilmiş bir oyundur.

## Proje Yapısı ve Sınıflar

### 1. Character (Soyut Sınıf)
- **Amaç:** Tüm karakterlerin ortak özelliklerini (isim ve seviye) barındırmak.
- **Özellikler:** 
  - `name` : Karakterin adı.
  - `level` : Karakterin seviyesi.
- **Metotlar:** 
  - Soyut `speak()` metodu, her karakterin kendine özgü bir şekilde konuşmasını sağlar.

### 2. Hero (Kahraman)
- **Amaç:** Oynanabilir karakterleri temsil eder.
- **Detaylar:** 
  - `Character` sınıfından extend eder.
  - `speak()` metodu ile kahramanın kendine özgü mesajını verir.

### 3. Enemy (Düşman)
- **Amaç:** Oyun içindeki düşman karakterleri temsil etmek.
- **Detaylar:**
  - `Character` sınıfından extend eder.
  - `speak()` metodu farklı bir mesajla düşman karakteri temsil eder.

### 4. Questable (Arayüz)
- **Amaç:** Quest kabul edebilen karakterler için ortak yapı.
- **Metotlar:**
  - `acceptQuest(String questName)`: Karakterin verilen quest’i kabul etmesini sağlar.
- **Not:** İlerleyen aşamalarda Mage ve Warrior gibi sınıflar bu arayüzü implement edecek.

### 5. QuestBoard (Quest Panosu)
- **Amaç:** Quest’leri saklamak ve Questable özelliğe sahip karakterlere atamak.
- **Özellikler:**
  - Quest ekleme ve atama işlemleri yapılır.
  - Questboard’da olmayan quest’ler için uygun hata mesajları verir.

### 6. BattleManager (Savaş Yöneticisi)
- **Amaç:** Hero ve Enemy arasında savaş simülasyonu yapabilmek.
- **Detaylar:**
  - Basit bir seviye karşılaştırması yapılarak kimin kazandığını belirler.
  
### 7. Mage ve Warrior Sınıfları (Takım Çalışması)
- **Mage:**
  - `Hero` sınıfından extend eder.
  - `Questable` arayüzünü implement eder.
  - Ek metod: `castSpell()` – büyü yapma yeteneğini simüle eder.
- **Warrior:**
  - `Hero` sınıfından extend eder.
  - `Questable` arayüzünü implement eder.
  - Ek metod: `attack()` – saldırı yeteneğini simüle eder.

## Örnek Çalıştırma

Projede yer alan `Main.java` dosyası, temel özelliklerin nasıl çalıştığını görmek için örnek bir senaryo içeriyor:

- **Hero** ve **Enemy** nesneleri oluşturuluyor.
- Her iki karakter `speak()` metodu ile kendi mesajlarını veriyor.
- `BattleManager` kullanılarak basit bir savaş simülasyonu gerçekleştiriliyor.

Örnek çıktı:

- Ben bir kahramanım!
- Ben bir düşmanım!
- Aragorn ile Ork arasında savaş başlıyor!
- Aragorn Ork'u yendi!


## Git Workflow ve İş Akışı

Proje geliştirme sürecinde aşağıdaki adımlar izlenmiştir:

- **Branch Oluşturma:**
  - Projeye başlamadan önce `Week-6` adında yeni bir branch oluşturuldu.
  - Tüm geliştirmeler bu branch üzerinde yapıldı.

- **Commit Mesajları:**
  - Commit mesajları belirli formata uygun olarak yazıldı:
    - `Initial Commit - #301: Set up Eldoria game structure`
    - `Feature - #302: Created Mage character with castSpell()`
    - `Feature - #303: Created Warrior character with attack()`
    - `Bugfix - #304: Added .gitignore for logs and temp files`

- **Push ve Merge:**
  - Tüm commitler düzenli olarak SourceTree üzerinden push edildi.
  - Merge çatışmaları çıktığında "Resolve Conflicts" aracı kullanılarak çözüldü.


## Nasıl Çalıştırılır?

1. **Repo Klonlama:** GitHub üzerinden projeyi klonlayın.
2. **IDE Açma:** IntelliJ IDEA ya da tercih ettiğiniz IDE’de projeyi açın.
3. **Maven Build:** Proje yapılandırmasını Maven ile build edin.
4. **Çalıştırma:** `Main.java` dosyasını çalıştırın ve örnek çıktıyı gözlemleyin.
