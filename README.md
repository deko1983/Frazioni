## Scopo

Creare una libreria in grado di gestire le operazioni aritmetiche tra frazioni. La frazione è una tipologia di numero che solo la mente umana concepisce, dobbiamo qui creare la logica che conosciamo per farne un tipo di dato fruibile.

## Procedimento
Troverai già lo scheletro di alcune classi. Lo scopo è costruire una classe Frazione concreta che implementi l'interfaccia AritmeticaFrazioni.

## Vincoli
Quando istanzi un oggetto Frazione, applica subito la semplificazione.
Se ti serve il calcolo del massimo comun divisore (MCD), questo è l'algoritmo (n=numeratore, d=denominatore):

        while (d != 0) {
            int temp = d;
            d = n % d;
            n = temp;
        }
        return Math.abs(n);

## Suggerimenti
La matematica dietro questa libreria è semplice, l'hai studiata sicuramente ma capisco tu la possa non ricordare. Consulta tutte le pagine web e tutte le intelligenze artificiali per farti aiutare, se poi non saprai mettere insieme ancora i pezzi significa che devi ancora allenare l'aspetto sintattico/semantico della programmazione.


