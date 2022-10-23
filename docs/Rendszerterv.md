# Rendszerterv

### A rendszer célja

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

### Üzleti folyamatok modellje

### Funkcionális terv

A program kezelését egyetlen felhasználó végzi. A hagyományos mérőeszközökkel történő mérésekhez
hasonlóan itt sincs szükség egynél további felhasználó beavatkozására. Ő végzi az összes lehetséges
cselekvést az alkalmazásban.

A program három felülettel rendelkezik, mindegyikben más-más dolgokat tud csinálni a felhasználó.

A főmenüben 3 gomb közül tud választani a felhasználó, melyek megnyomásával különböző dolgokat hajt
végre.

Az 'Indítás' gombbal átirányítódik arra a felületre, ahol a mérést tudjuk végezni.

Az 'Előzmények' gomb megnyomásával arra a felületre jutunk, ahol meg tudjuk tekinteni korábbi méréseink
eredményét.

A 'Kilépés' gomb használatával pedig be tudjuk zárni a programot.

A mérési menüben a középen található indítógomb megnyomásával tudjuk elindítani mérésünket, valamint
leállítani, ha lemértük a kívánt távot.

Az előzményeket tartalmazó felületen végig tudjuk nézni korábbi mérésadatainkat, végig tudunk
görgetni köztük.

### Fizikai környezet

* Az alkalmazás android rendszerre fog készülni

* Fejlesztői eszközök:

    * Android Studio

    * Maven

### Tesztelési terv

### Telepítési terv

A játék Android platformra telepíthető

- Az alkalmazás nem Google Play-en keresztül elérhető.

- Elérés módja: Az alkalmazás Github tárolóján keresztül letölthető

- Beállításokban a telepítéshez engedélyezni kell a 3. féltől származó tartalmakat

- Telepítéshez a letöltött ".apk" állományt kell futtatni

## Karbantartási terv

- Fix időszakonként ellenőrizni fogjuk hogy a játék egyes funkciói megfelelően működnek-e,
  ellátják-e szükséges feladataikat, nem történik-e váratlan hiba

- Ellenőrizzük, hogy jövőben kiadott Android verziókkal kompatibilis legyen

- Új képernyő méret szabványok megjelenése esetén a felhasználói felület elemeire vonatkozóan
  biztosítjuk a rezponzivítást

- A keletkező hibákat, bugokat a lehető leghamarabb próbáljuk kijavítani