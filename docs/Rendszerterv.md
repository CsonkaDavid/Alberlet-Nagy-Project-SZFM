# Rendszerterv

### A rendszer célja

A projekt célja, hogy létrehozzunk egy olyan alkalmazást mely képes minden irányban pontos
távolságot mérni kezdő- és végpont között.

Telefonjaink általában mindig nálunk vannak és egyszerre többféle hasznos funkcionalitással is 
rendelkeznek amelyek elérhetőek mobil applikációkon keresztül.
Éppen ezért nem szükséges, hogy ilyen eshetőségre tarstunk magunknál különféle eszközöket, hiszen a
mobilalkalmazásunkkal képesek vagyunk mindezt megtenni. 
Ezáltal nem leszünk gondban, ha ilyen
szituációba kerülnénk, és mérésre lenne szükség, hanem csak elővesszük telefonkészülékünket,
elindítjuk programunkat, és már meg is van oldva a probléma. 
Ennek alapjaként a telefonokba beépített gyroscope és gyorsulásmérő szolgálnak, programunk is erre 
épülve működik. 
Hiszen programunk elindítása, és az 'Indítás' gomb megnyomása után szimplán adunk egy bemenetet
programunknak, és a mobilunkba beépített hardverek elkezdik működésüket, és addig végzik a mérést,
amíg a felhasználó manuálisan le nem állítja, vagy pedig egy megadott kilépési feltétel nem
teljesül.

Ezenfelül - mérőeszköztől függően - táskánkban egy kis helyet is spórolunk, hiszen nem kell mást,
csak legfontosabb dolgainkat magunknál tartani.

Szintén meg kell említeni, hogy alkalmazásunk a mérőeszközök hiányosságait is pótolja, hiszen sok
esetben szükség lehet, hogy korábbi méréseink adatait számon tartsuk, erre pedig megoldást nyújt
programunk, hiszen alkalmazásunkban egy gomb megnyomásával elérhetjük előzményeinket,
leellenőrizhetjük ha éppen egy korábbi adatra van szükségünk. 
Ennek forrása egy adatbázis lesz,ahová egy mérés befejezte után az adatok kimentődnek. Miután pedig 
megnyomjuk az 'Előzmények' gombot, az adatbázisból kiolvasásra kerülnek a korábbi eredmények, és 
betöltődnek egy, a felhasználó számára jól olvasható formában. Ezzel megspórolhatunk néhány mérést
arra az esetre, ha elfelejtenénk korábbi eredményünket.

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

A tesztelésünk célja, hogy meggyőződjünk róla, hogy az alkalmazásunk komponensei, valamint az
alkalmazás egésze úgy működik-e, mint kellene. Ezen felül leellenőrizzük, hogy nincsenek-e a
programban hibák, bugok, amik tönkretennék a játékélményt. Meggyőződünk róla, hogy a felhasználói
felület elemei a nekik beállított funkciókat megfelelően látják-e el, illetve a különböző szabványú
kijelzőkön hasonló arányban helyezkednek-e el.

Tesztelési folyamatunk lépései:
1. Egységteszt

- Egységtesztünkben ellenőrizzük le, hogy a programunkat alkotó metódusok külön-külön megfelelően 
funkcionálnak-e, a különbőző bemenetekre az elvárt kimeneteket produkálják.

- Biztosítjuk, hogy tesztjeink a program kódjának minél nagyobb részét lefedjék.

- Akkor nevezhetőek sikeresnek tesztjeink, ha minden lehetséges bemenetre az elvárt kimenetet 
produkálják.

- Akkor megfelelő az egységtesztünk, ha a kódot a lehető legnagyobb részben lefedi.

2. Funkcionális teszt

- A funkcionális tesztek cégünk fejlesztői által lesznek elvégezve.

- Funkcionális tesztünkben minél többféle futtatókörnyezetben (pl.: különböző telefonokon, Android 
verziókon) teszteljük a játékélményt.

- Megnézzük, hogy a mérési folyamat zökkenőmentesen zajlik-e, bugoktól, funkcionális hibáktól
mentes -e.

- Akkor sikeres tesztünk, ha minden tesztelt környezetben hibamentesen lefutott a program, nem 
történt rendellenes működés.

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