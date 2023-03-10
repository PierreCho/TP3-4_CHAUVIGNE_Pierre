# TP3-4_CHAUVIGNE_Pierre
 
SPRING WEB :

C'est un module qui fournit l'ensemble des fonctionnalitées pour la création et l'intégration d'une application web. Il permet de développer plus rapidement grâce à l'utilisation des différents modules qui le composent.

----
SPRING DATA JPA :

Ce module simplifie l'intéraction avec les systèmes de stockages de données, elle permet aux développeurs d'éviter de coder les accès pour le système cible.

----
HIBERNATE :

Hibernate permet de représenter une base de données en objets java et inversement. C'est notamment utilisé manipuler une base de données à partir d'un fichier .sql situé dans un projet java.

----
H2 DATABASE :

C'est un système de gestion de bases de données relationnelles en java. Il nous permet d'intéragir avec celles-ci directement à partir d'un navigateur.

----
SPRING BOOT DevTools :

Il permet d'automatiser le redémarrage et le rechargement d'une application après une modification de ses fichiers.

----
THYMELEAF :

Il permet de générer des vues pour une application web telle qu'une barre de navigation par exemple.


----
QUESTIONS ETAPE 13:

1. La partie du code qui nous permet de paramétrer l'url d'appel est l'annotation @GetMapping("/greeting")

2. La partie du code qui permet de choisir le fichier html l'afficher est la fonction greeting grâce au return "greeting".

3. Nous envoyons le nom à travers l'annotation @RequestParams qui récupère le nom dans l'url avant de le passer en paramètre dans la fonction model.addAttribute.


----
QUESTION ETAPE 16:

Pour ajouter les setters et les getters facilement avec notre IDE, il suffit de faire un clic droit sur les variables puis les générer automatiquement.


----
QUESTION ETAPE 17:

La différence est l'apparition de la table ADDRESS et de l'onglet Sequences dans le menu à gauche de la fenêtre.
De plus, il est nécessaire d'utiliser le nouvel id pour la base de données comme il change entre chaque exécution de mvn spring-boot:run par exemple = "jdbc:h2:mem:aadc0959-4efc-41e7-976c-5b45e1421574"


----
QUESTION ETAPE 18:

L'apparition de la nouvelle table s'explique par le fait qu'hibernate permet de passer du langage java au langage base de données.


----
QUESTION ETAPE 20:

Pour vérifier que les inserts situés dans le fichier data.sql fonctionnent, nous utilisons la commande sql SELECT * FROM address; et on remarque qu'ils ont bien été ajoutés.

EXTRAIT:

SELECT * FROM address;
ID      CONTENT      CREATION
1    57 boulevard demorieux    2023-01-18
2    51 allee du gamay, 34080 montpellier    2023-01-18
(2 rows, 3 ms)


----
QUESTION ETAPE 22:

L'annotation @Autowired permet l'injection de dépendances de manière automatique.


----
QUESTION ETAPE 26:

En ajoutant les auteurs à la base de données, on obtient le résultat suivant :

SELECT * FROM ADDRESS;
ID      AUTHOR      CONTENT      CREATION
1    Pierre    57 boulevard demorieux    2023-01-18
2    Thomas    51 allee du gamay, 34080 montpellier    2023-01-18
(2 rows, 4 ms)


----
QUESTION ETAPE 30:

Pour ajouter bootstrap au projet, il suffit de se rendre sur le site officiel de bootstrap et de naviguer vers la partie starter template.
Une fois rendu sur la page, il faut copier coller les deux tag meta et le links situés dans le header pour ensuite les coller dans le fichier hearder.html qui représente la navbar et qui est appliqué à toutes les pages html.
Ensuite, il faut aussi reporter le tag <script> situé dans le body et relancer spring pour que bootstrap soit ajouté au projet.

----

TP4 - Etape 06
1- Pour appeler l'API de meteo-concept.fr, il est nécessaire de posséder une clé, c'est à dire un token qui est généré afin de nous donner l'accès aux services de l'API
   une fois un compté créé.

2- Pour accéder au service, il faut appeler l'URL suivant https://api.meteo-concept.com/api/forecast/daily?token= en ajoutant le token générer avec la création du compte
   et enfin les coordonnées de la ville choisie. On obtient alors dans mon cas :
   "https://api.meteo-concept.com/api/forecast/daily?token="+ token + "&latlng="+y+","+x

3- Il faut uiliser la méthode HTTP GET car elle est le seul type de requête supporté par l'API meteo_concept.

4- Pour passer en paramètre les coordonnées de la ville saisie dans la seconde API, il est necéssaire d'ajouter le paramètre $latlng=y,x dans l'URL.
   Il faut l'ajouter après le token utilisateur.

5- Pour afficher la température du lieu visé par les coordonnées GPS, il faut naviguer dans le fichier JSON : forecast.getTmin() et forecast.getTmax() une fois la réponse JSON envoyée.

6- En ce qui concerne l'affichage de la prévision météo il faut aussi naviguer dans la fichier JSON : forecast.getWeather() une fois la réception du fichier JSON envoyée.
