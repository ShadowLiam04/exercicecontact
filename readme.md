# Gestionnaire de Contacts

Ce projet est une simple application de gestion de contacts développée en Java. Elle permet d'ajouter des contacts et de rechercher des contacts existants par leur nom.

## Fonctionnalités

-   Ajout de nouveaux contacts (nom et numéro de téléphone).
-   Recherche de contacts par nom.
-   Affichage du numéro de téléphone du contact trouvé.

## Structure du Projet

-   `Contact.java`: Définit l'objet Contact avec un nom et un numéro de téléphone.
-   `ContactsManager.java`: Gère la collection de contacts (ajout et recherche).
-   `Main.java`: Contient la logique principale de l'application, incluant la création de contacts, leur ajout au gestionnaire et la recherche d'un contact.

## Comment importer et exécuter le projet avec IntelliJ IDEA

1.  **Cloner le dépôt :**
    Ouvrez IntelliJ IDEA.
    Dans l'écran de bienvenue, choisissez "Get from VCS".
    Collez l'URL de ce dépôt GitHub (`https://github.com/YOUR_USERNAME/ContactsManager-Java.git`) et cliquez sur "Clone".

2.  **Ouvrir le projet :**
    Si vous avez déjà IntelliJ ouvert, allez dans `File > Open...` et naviguez jusqu'au dossier où vous avez cloné le dépôt. Sélectionnez le dossier racine du projet et cliquez sur "Open".

3.  **Configurer le SDK Java :**
    IntelliJ devrait détecter automatiquement le SDK Java. Si ce n'est pas le cas, allez dans `File > Project Structure...` (`Ctrl+Alt+Shift+S` ou `⌘;`).
    Sous "Project Settings" > "Project", assurez-vous qu'un **SDK de projet** est sélectionné (par exemple, Java 11, 17, etc.).
    Sous "Platform Settings" > "SDKs", assurez-vous que le chemin de votre installation Java est correct.

4.  **Exécuter l'application :**
    Ouvrez le fichier `Main.java` (situé dans `src`).
    Cliquez sur la flèche verte à côté de la déclaration de la méthode `main` et sélectionnez "Run 'Main.main()'".
    Vous devriez voir la sortie dans la console d'exécution d'IntelliJ.

## Auteur

FALLE DAVID LIAM