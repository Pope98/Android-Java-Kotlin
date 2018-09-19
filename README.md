# Android-Java-Kotlin
Visma project dog_urls

// DESCRIPTION
//-----------------------------------------------------------------------------------------------------------------------------------------

Praktinės užduoties aprašymas

Turite .json failiuką su šunų nuotraukų nuorodomis. Pagrindinės užduoties dalys:

Susikurkite tuščią projektą ir įkelkite .json failiuką į failų struktūrą.

Susigalvokite būdą, kaip turimo .json failiuko turinį nuskaityti ir sudėlioti į masyvą. Galima naudoti biblioteką arba susirasti kaip, tai padaryti su jau turimais įrankiais pačioje programavimo kalboje.

Turite masyvą, kuriame daug nuorodų į nuotraukas (internete). Jums reikės atsisiųsti nuotraukas ir jas atvaizduoti.

Sukurkite langą, kuriame bus atvaizduojamos nuotraukos. Galite naudoti list’ą arba grid’ą.

Lango išdėstymas turėtų prisitaikyti prie ekrano dydžio.

Jeigu kils problemų atvaizduojant nuotraukas, galite naudoti pirmąsias 10.

Visai užduočiai stenkitės naudoti gerąsias programavimo praktikas.

Papildomai:

Padarykite galimybę paspausti ant kiekvienos nuotraukos (kiekvieno list’o/grid’o įrašo), kuris atidarys kitą langą su ta nuotrauka per vidurį ekrano arba tiesiog padidins nuotrauką ir parodys ją ekrano centre.


Užduotį atlikite naudojant Android(java/kotlin) arba iOS(Swift/Objective-C) platformą.

//-----------------------------------------------------------------------------------------------------------------------------------------

RUN APPLICATION: 
CMD : java -jar dogs1\dogs1.jar

or

double-click dogs1.jar in project folder dogs1.

Description:

1) Program parses dogs_url.json file and stores urls to array.
2) Program downloads and stores images to image folder.
3) Program creates window and displays photos in list.
If you click on a photo, a selected photo will be fitted in a new window.

!! If program doesn't run, try creating a new folder 'images' in project directory dogs1.

Made by Povilas Petrauskas 2018-09-19
