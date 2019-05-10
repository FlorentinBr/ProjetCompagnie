# Projet Compagnie

Ce projet consiste à développer une application de gestion de réservations de vols pour une compagnie aérienne. Elle va donc automatiquement programmer des vols en choisissant parmis les avions de la compagnie dans un aéroport donné l'appareil le plus adapté au nombre des réservations et à la destination des passagers. 
L'application fourni à la compagnie, une fois le vol plannifié, un récapitulatif de ce dernier.
Cette application permet aussi aux voyageur de faire une réservation sur une interface à part.
Pendant la réalisation de ce projet nous n'avons pas utilisé autre chose que Java sur l'IDE Eclipse pour construire l'application. 

## Pour lancer l'application

### Prérequis

Installez, si ce n'est pas déjà fait, un IDE spécifique au language java. Pour ce faire installez d'abord un jdk [en cliquant ici](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), puis [installez Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2019-03/R/eclipse-inst-linux64.tar.gz).

#### Installation

Etant donné que vous lisez ce document vous savez que dans le même dossier qui le contient se trouve un dossier Projet compagnie.
En ouvrant Eclipse choisissez n'importe quel espace de travail et cliquez sur **'launch'**.

![Screenshot](https://github.com/FlorentinBr/ProjetCompagnie/blob/master/Capture%20d%E2%80%99%C3%A9cran%20de%202019-05-09%2010-41-44.png)

Ensuite, sur la barre des menus, dans 'Files' cliquez sur **'Open project from files system'**.
Une nouvelle fenêtre s'ouvre, cliquez sur **'Directory'** et allez chercher le dossier contenant entre autre ce readme et selectionner le fichier nommé ProjetJava. 

Enfin cliquez sur **'Finish'**.

## Utiliser l'application

Double cliquez sur le dossier **'ProjetJava'**, puis sur **'packageProjet'**, puis sur **'Main'**.
Une fois le main ouvert sur l'éditeur, cliquez sur le bouton  ![Screenshot](https://github.com/FlorentinBr/ProjetCompagnie/blob/master/Capture%20d%E2%80%99%C3%A9cran%203.png) en haut à gauche.

Vous pouvez alors utiliser l'application.

ATTENTION : Lors de chaque clic menant a l'apparition d'une fenêtre, cette dernière va apparaître en double, il se peut de plus que la deuxième fenêtre passe en arrière plan et que les fenêtres s'empilent les unes sur les autres (ceci n'est pas gênant en soi mais nous n'avons pas réussi à résoudre le problème...)

Cliquez sur **"Entrer dans l'application"** pour débuter.
Celle-ci contient deux interfaces principales, Compagnie et Voyageur.

**Fenêtre compagnie** :
  Trois onglets sont à dispositions, ils permettent principalement de visualiser les éléments de la compagnie.
  
  
  Dans l'onglet aeroport : 
    Cliquez sur **"Afficher nos aeroports"**, vous aurez ensuite besoin de cliquer "dans le vide" (sur un endroit vide de l'interface) pour que le menu déroulant s'affiche. 
    La liste de tous les aeroports est disponible, vous pouvez cliquer sur n'importe lequel pour faire apparaître les dates.
    Vous pouvez ensuite choisir une date pour faire apparaître la liste des avions disponibles dans l'aeroport concerné a la date choisie.
    
  Dans l'onglet avion :
    Deux boutons sont disponibles, ils permettent tous les deux d'afficher une liste des avions appartenant a la compagnie. Il faut de même cliquer dans le vide pour que les listes s'affichent.
    Le premier n'affiche que les modèles, et vous pouvez cliquer sur n'importe lequel pour afficher un gif de l'appareil en question.
    Le deuxième bouton affiche quant à lui les différents appareils, et vous pouvez observer les détails techniques en cliquant dessus.
    
  Dans l'onglet vol :
    Cliquez sur **"nos vols"** puis dans le vide pour afficher les différents dates disponibles.
    Vous pouvez ensuite choisir une date pour afficher la liste des vols prévus à cette date ainsi que leurs détails.
    Initialement, aucun vol n'a été préalablement enregistré donc toutes les listes de vols sont vides, néanmoins nous avons manuellement rentré un vol dans le main pour pouvoir observer cette partie de l'interface, le vol est programmé au jour 10 comme vu ci-dessous.
    
![Screenshot](https://github.com/FlorentinBr/ProjetCompagnie/blob/master/Capture%20du%202019-05-10%2022-25-00.png)
    
    
**Fenêtre voyageur** : 
  Deux boutons sont à disposition.
  **"Identification"** ouvre une fenêtre où un voyageur peut entrer ses informations : Nom, Prénon, Date de naissance et poids (initialement 20kg). Entrez toutes vos informations puis appuyer sur la touche entrée de votre clavier.
  Une fenêtre de bienvenu s'ouvre.
  
  Le bouton **"Déja enregistré"** permet quant à lui d'afficher la liste des voyageurs qui se sont déjà enregistré.
  Initialement celui-ci est vide mais nous avons instancié manuellement un voyageur pour pouvoir observer cette partie.
  
![Screenshot](https://github.com/FlorentinBr/ProjetCompagnie/blob/master/capture_voyageur.png)


    




