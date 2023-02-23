# Uppgift nätverk
Din uppgift är att skriva ett chatprogram som utnyttjar TCP/IP och Sockets i Java för att kommunicera över nätverket. 
Programmet ska bestå av två delar, en server och en klient, och båda ska vara strukturerade enligt MVC på samma sätt som 
de andra programmen ni arbetat med under kursen. Genom att använda MVC kan vi använda detta program som grund för andra 
typer av nätverksprogram. Byt view till ett schackbräde och bygg ut modellen till att hantera schackdrag så har ni ett online schack.  

## Grundkrav
De två programmen ska ha en tydligt uppdelad struktur där View (GUIt) ska vara ett enkelt Swingfönster med de komponenter 
och funktioner som behövs för att lösa uppgiften. I Modellen ska all kod som gör något finnas. Viktigt är att allt som har 
med Sockets och BufferedReader/PrintWriter finns här. Controllerns uppgift är att sköta kommunikationen mellan View och client.Model.

Ditt program ska kunna göra
* Ansluta en klient till en server
* Använda guit för att skicka och ta emot meddelanden. 
* Programmen ska hantera skicka och ta emot simultant (samtidigt) med hjälp av trådar.

## Saker att hålla koll på
Det måste finnas ett sätt att ange ip och port för klienten innan socketen skapas. Fundera på var informationen ska komma 
ifrån. Från guit eller ska det anges innan model och view skapas. 

Eftersom inkommande trafik landar i client.Model finns det inget naturligt sätt för controllern att veta när det är dags att hämta 
information från modellen och presentera den i View. Finns det en renderingsloop som i game-of-life är detta inget problem men 
annars kan ni böja lite på reglerna och tillåta att modellen talar om för kontrollern att det finns ny information.

Eftersom server och klient eventuellt gör olika saker behöver ni fundera på om det behövs olika versioner av tråden som 
lyssnar, en för klienten och en för servern. Best practise är att låta servern vara bara server och ha två instanser av 
klienten men det är inget krav. Om ni öppnar upp för flera klienter blir dock detta nästan ett krav.

Strukturera koden med package så att ni inte blandar ihop servern och klienten.

## Arbetsgång
* Skriv ner vad ditt program ska kunna göra i din readme.md.
* Skapa ett package för klienten och ett för servern
* skapa de tre klasserna för MVC i var och en av servern och klienten
* Designa ett enkelt gui (i view.java) för servern och för klienten
* Se till att controllern kan köra igång model och view
* Skapa modellerna med enklast möjliga funktionalitet (uppkoppling och skicka och ta emot "Hej!")
* Lägg till funktionerna en efter en

## Förslag på ytterligare funktionalitet
* Skriv servern så att den kan hantera flera klienter. Det räcker egentligen med två klienter och en server som bara är 
server, då kan programmet utökas oavsett. För att lösa detta behöver servern skapa nya trådar för varje klient och det 
är en god idé att göra en egen klass för klientens funktioner i serverprogrammet.
* Ge klienterna ett unikt id så att en klient kan skicka något direkt till en annan klient
* Lägg till "bottar" på servern som reagerar på speciella kommandon eller frågor, "Vad är klockan?", "vilka är med i chatten?" 
eller "Skriv ett gymnasiearbete!"
* Lägg till olika nivåer av klienter, admins som kan kicka eller banna klienter och ipn.
* Gör ett mer avancerat GUI som kan göra fler saker (skicka filer, spara konversationer ...)

## Saker du kan fundera på hur de skulle lösas med en liknande teknik
* Hur skulle ett delat anteckningsverktyg kunna funka?
* Hur skulle ett delat ritprogram kunna funka?
* Hur ska informationen i ett mer komplext system paketeras? Funkar det med att konvertera allt till text eller behövs 
en objectStream för att skicka instanser av en klass? Vi kommer att titta lite på det senare.

## Inlämning
Lämna in en länk till ditt repo som svar på uppgiften. Se till att det finns en readme.md  som förklarar vad ditt program 
ska kunna göra.