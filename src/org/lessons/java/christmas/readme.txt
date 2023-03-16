/*
     * - Creare un metodo contaDesideri(List<String> desideri) che conta quante volte ogni desiderio
     * appare nella lista e restituisce una Map<String, Integer> con i relativi conteggi.
     *
     * - Vogliamo rimuovere i duplicati dalla lista. Creare un metodo desideriUnici(List<String> desideri) che restituisce
     * un Set<String> contenente i desideri della lista (saranno già deduplicati per via del Set)
     *
     * - Creare una classe Desiderio che contiene nome e destinatario. Modificare il codice scritto in precedenza
     * in maniera tale da non avere più i desideri come List<String> ma List<Desiderio> (dobbiamo di conseguenza chiedere all'utente
     * non solo il desiderio ma anche il destinatario).
     *
     * Modificare adeguatamente anche i metodi creati contaDesideri e desideriUnici per farli funzionare correttamente
     * con la nuova List<Desiderio>.
     *
     * Creare un nuovo metodo contaDesiderPerDestinatario(List<Desiderio> desideri) che funziona analogamente a
     * contaDesideri ma restituisce una Map<String, Integer> dove la chiave è il destinatario e il valore è
     * il numero dei suoi desideri.
     *
     */