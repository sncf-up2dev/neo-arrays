# Tableaux avancés

L'objectif de cet exercice est de créer des types génériques qui permettent des utilisations avancées des tableaux.

## Tableaux immutables

La classe générique `ImmutableArray` doit être paramétrable avec n'importe quel type objet.
L'intérêt de cette classe est de pouvoir créer des tableaux immutables, dont on ne peut ni ajouter, ni supprimer, ni modifier d'items.  

Le constructeur de cette classe prend en paramètre un tableau d'une taille quelconque.

La classe possède une méthode en lecture seule.
* La méthode `get()` qui prend en entrée un indice et envoie en retour la valeur de ce tableau à cet indice.
* La méthode `length()` qui envoie la taille du tableau stocké (elle ne prend aucun paramètre).
 

## Tableaux triés

La classe générique `OrderedArray` hérite de la classe `ImmutableArray`, il doit être paramétrable avec n'importe quel type objet.

L'intérêt de cette classe est de pouvoir créer des tableaux immutables et triés. Le tri doit se faire à la création de l'objet.

Pour réaliser le tri, on peut faire recours à [la méthode statique `Arrays.sort()`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html#sort(java.lang.Object%5B%5D)).
La méthode prend un tableau de type `Object` en paramètre, mais jete une exception si l'un des objets du tableau n'est pas de [type `Comparable`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html).

L'objectif est donc de faire en sorte que le type du tableau soit un sous-type de `Comparable` en temps de compilation.

## Vérification

Étant donné un nom de paquetage `fr.sncf.up2dev.arrays`, les tests dans [la branche `tests`](https://github.com/sncf-up2dev/neo-arrays/tree/tests) de ce dépôt doivent passer sans échecs pour une solution correcte.