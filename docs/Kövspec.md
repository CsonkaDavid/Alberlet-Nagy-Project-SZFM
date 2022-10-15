# Követelmény specifikáció

### Áttekintés

Az általunk fejlesztett program egy Android-os telefonokra írt mérőalkalmazás.

A működés alapjául a telefonokba beépített gyorsulásmérő, valamint a gyroscope szolgál.

A program alapvető működése annyiból áll, hogy a telefonkészüléket ahogy fokozatosan mozgatjuk, az alkalmazás ezzel arányosan méri a kezdőponttól megtett távolságot.
Segítégével hosszt, távolságot tudunk mérni. Ha egy mérés megtörtént, utána a mért adatokat a program kimenti egy adatbázisba.

### Jelenlegi helyzet

Világunk a modernizáció korát éli, a legtöbb eszközünk már elektronikus.
Sok szituációban azonban, például különböző méretvételek alkalmával az átlagembereknek - ácsoknak főleg - szükség lehet arra, hogy távolságokat mérjünk, méreteket vegyünk.

Ezenfajta dolgok általában colostokok, mérőszalagok segítsésével történnek, de - hacsak előre nem tudunk arról, hogy szükség lenne rá - általában
nem tartunk magunknál mérésre alkalmas eszközt. Telefonunk azonban mindig nálunk van, szinte minden szituációban, ezért is hasznos alkalmazásunk, hogy ilyen esetben tudjunk mérni.

### Vágyálom rendszer

A projekt célja, hogy létrehozzunk egy olyan alkalmazást mely képes minden irányban pontos távolságot mérni kezdő- és végpont
között.

Az alkalmazás képes kell legyen a következő műveletek elvégzésére:

+ Mérési kezdőpont kijelölése felhasználói bemenetre

+ Mérési végpont megállapítása felhasználói bemenetre vagy gyroscope és gyorsulásmérő által érzékelt minimum sebesség és elmozdulás alatti paraméterek érzékelése esetén

+ Mérési végpont és kezdőpont közötti pontos távolság megállapítása

+ Mért adatok megjelenítése "metric" és "imperial" mértékegység rendszerekben

+ Mért adatok tárolása erre előkészített adatbázis rendszerben

+ Mérési előzmények megjelenítése külön alkalmazás menüben

### Jelenlegi üzleti folyamatok

A mai világban műszaki és otthoni környezetben is szükségünk lehet mérőeszközökre. A rendelkezésre álló eszközök most többnyire a mérőszalagok
vagy a jól ismert colostok illetve digitális távolságmérők. Ezek az eszközök megbízhatóak és többnyire a legtöbb háztartásban megtalálhatóak,
azonban bármikor kerülhetünk olyan helyzetbe, hogy mégsincsenek kéznél, de mégis mérési műveletek végzésére van szükség. A legtöbb ember
ilyen helyzetekben illetve a mindennapi élet folyamán nem tart magánál mindig ilyen mérésre alkalmas eszközöket. Továbbá a legtöbb "kézi" 
mérőeszköz nem képes adattárolásra mint a különböző elektronikus megoldásuk bármelyike, ami azt eredményezi, hogy akár többszöri alkalommal
is le kell mérnünk újra és újra ugyanazokat a távolságokat szükségletektől függően. Ilyen szituációk lehetnek például különböző asztali díszek
vagy kiegészítők megfelelő méretben való vásárlása esetén történő mérések. Az ilyen szituációkban az eltárolt adatok megspórolhatnák egy-egy
mérés idejét.

Telefonjaink a fentebb említett eszközökkel ellentétben általában mindig nálunk vannak és egyszerre többféle hasznos funkcionalitással is rendelkeznek
amelyek elérhetőek mobil applikációkon keresztül. Egy ilyen plusz funckió a fent említett problémákat megoldaná egy egyszerűen használható, 
adatok tárolására is képes applikációval.