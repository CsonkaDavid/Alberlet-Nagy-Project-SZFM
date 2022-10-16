# Funkcionális specifikáció

### Áttekintés

Az általunk fejlesztett program egy Android-os telefonokra írt mérőalkalmazás.

A működés alapjául a telefonokba beépített gyorsulásmérő, valamint a gyroscope szolgál.

A program alapvető működése annyiból áll, hogy a telefonkészüléket ahogy fokozatosan mozgatjuk, az alkalmazás ezzel arányosan méri a kezdőponttól megtett távolságot.
Segítégével hosszt, távolságot tudunk mérni. Ha egy mérés megtörtént, utána a mért adatokat a program kimenti egy adatbázisba.

### Jelenlegi helyzet leírása

Világunk a modernizáció korát éli, a legtöbb eszközünk már elektronikus.
Sok szituációban azonban, például különböző méretvételek alkalmával az átlagembereknek - ácsoknak főleg - szükség lehet arra, hogy távolságokat mérjünk, méreteket vegyünk.

Ezenfajta dolgok általában colostokok, mérőszalagok segítsésével történnek, de - hacsak előre nem tudunk arról, hogy szükség lenne rá - általában
nem tartunk magunknál mérésre alkalmas eszközt. Telefonunk azonban mindig nálunk van, szinte minden szituációban, ezért is hasznos alkalmazásunk, hogy ilyen esetben tudjunk mérni.

### Vágyálom rendszer leírása

A projekt célja, hogy létrehozzunk egy olyan alkalmazást mely képes minden irányban pontos távolságot mérni kezdő- és végpont
között.

Az alkalmazás képes kell legyen a következő műveletek elvégzésére:

+ Mérési kezdőpont kijelölése felhasználói bemenetre

+ Mérési végpont megállapítása felhasználói bemenetre vagy gyroscope és gyorsulásmérő által érzékelt minimum sebesség és elmozdulás alatti paraméterek érzékelése esetén

+ Mérési végpont és kezdőpont közötti pontos távolság megállapítása

+ Mért adatok megjelenítése "metric" és "imperial" mértékegység rendszerekben

+ Mért adatok tárolása erre előkészített adatbázis rendszerben

+ Mérési előzmények megjelenítése külön alkalmazás menüben

### Követelménylista

| Modul       | ID  | Név           | v.  | Kifejtés                                                                 |
|-------------|-----|---------------|-----|--------------------------------------------------------------------------|
| Felület     | K1  | Indítás       | 1.0 | Ennek a gombnak a segítségével lépünk be a mérési felületre.             |
| Felület     | K2  | Előzmények    | 1.0 | Az előző mérések megjelenítésének felülete.                              |
| Felület     | K3  | Visszalépés   | 1.0 | A felhasználói felületekről való visszalépés az előző menübe.            |
| Felület     | K4  | Mérés indítás | 1.0 | A mérést ezzel indítjuk el vagy állítjuk le.                             |
| Felület     | K5  | Mérési adat   | 1.0 | A lemért adat megjelenítése.                                             |
| Statisztika | K6  | Lemért adatok | 1.0 | A mért adatok megjelenítése.                                             |
| Funkció     | K7  | Mérés         | 1.0 | A telefonos gyroscope és a gyorsulás szenzor segítségével távolságmérés. |

