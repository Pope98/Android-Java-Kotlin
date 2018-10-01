Created by Povilas Petrauskas 2018 September

LT:
-------------------------------------
Personaline užrašu sistema
Programa turi išvesti visu dabartines savaites dienos (pvz., treciadieniu) datas iki duotosios datos.
Formatas(pvz.): 2009-09: 2009-09, 2009-16, 2009-23, 2009-30 ... ...
Skaiciuojant buvo panaudota joda-time-2.10 biblioteka, kuri leidžia lengvai atlikti skaiciavimus su
datomis, taip pat yra daug greitesne, lankstesne ir efektyvesne, nei Java Calendar ir Dates bibliotekos,
todel buvo pasirinktas jos pritaikymas šioje programoje.

Pagrindine programos logika - Calculator.java klaseje
PersonalNoteSystem.java implementuoja lango sukurima, komponentu išdestyma, vartotojo interakcija
bei atlieka keleta foolproof patikrinimu.

EN:
-------------------------------------
Personal Note System
Program outputs all dates of current week_day between two selected dates. Example: choose
2018-10-01 (Monday) as start date, and 2019-01-01 as end date. Program displays the dates of all Mondays
between two given dates.
Program uses joda-time-2.10 libraries that allow to perform rapid, flexible and effective calculations
related to dates. This library replaces standart Java libraries (Java Calendar and Date) of it's
flexible and easy-to-understand usage.

Programs main logic is implemented in Calculator.java class
PersonalNoteSystem.java implements the creation of window, action listening, component layout and 
foolproof tests.