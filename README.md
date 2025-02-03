# Esercizio fatturazione elettronica
Un bar del centro vuole digitalizzare le comande attraverso un programma. \
Il programma visualizza il menu per le colazioni leggendo un file con il listino di un bar, e permette all'utente di
- visualizzare il menu
- aprire una nuova comanda
- entrare in modalità amministratore

## Visualizzazione del menu
Viene visualizzato il menu del bar, tramite un elenco di piatti, ognuna con il suo prezzo. L'elenco dei piatti deve essere stato letto da un file `menu.txt`. \
Di seguito, un esempio di menu:
```
cappuccino: 1.30 €
caffè: 1.00 €
briocher: 0.80 €
briocher_marmellata: 1.00 €
cioccolata: 1.50 €
spremuta: 1.40 €
toast: 1.70 €
panino a scelta con affettato: 3.50 €
```

## Creazione di una nuova comanda
Viene aperta una nuova comanda, in cui possono essere aggiunti più piatti. \
Alla fine dell'aggiunta dei piatti viene mostrato all'utente un riepilogo della comanda,
che può essere confermato o modificato. \
Una volta confermata la comanda, l'elenco completo dei piatti scelti, con nome e prezzo del piatto, e alla fine il prezzo totale,
viene aggiunto in un file `scontrino-YYYY-MM-DD-HH-MM-SS.txt` (YYYY, MM, DD, HH, MM, SS sono, rispettivamente,
anno, mese, giorno, ora, minuti e secondi letti nel momento in cui lo scontrino è stato generato).

## Entrare in modalità amministratore
Tramite nome utente e password segreti, l'utente può entrare in modalità amministratore. \
In modalità amministratore, può effettuare le seguenti attività:
- visualizzazione del menu
- aggiunta di un nuovo piatto al menu
- rimozione di un nuovo piatto dal menu
- fatturazione elettronica della giornata

### Aggiunta e rimozione di piatti dal menu
L'aggiunta e la rimozione di un piatto deve modificare il file `menu.txt`, in modo da essere persistente anche alla chiusura
dell'applicazione. Inoltre, quando modificato il menu, il nuovo menu deve essere immediatamente accessibile per la creazione
dei nuovi scontrini. \
__Attenzione:__ modificando il menu, i piatti che vengono rimossi devono continuare ad essere validi sugli scontrini vecchi,
perché i dati degli scontrini emessi non possono essere invalidati.

### Fatturazione elettronica della giornata
L'operazione mostra a schermo e scrive su un file `fattura_YYYY_MM_DD.txt` il numero di scontrini emessi nella giornata corrente e
il totale guadagnato dal bar.
__Attenzione:__ se il programma viene chiuso e riaperto nella stessa giornata, la fattura deve conteggiare gli scontrini emessi sia
prima che dopo la chiusura dell'applicazione, quindi gli scontrini emessi non sono letti dalla memoria, ma sono letti uno a uno
da file, ricercandoli per data (si utilizzi il filename dello scontrino, contenente la data, per isolare, tra tutti gli scontrini,
quelli della giornata precedente).
