<h1># TP3_redis</h1>
<h2>#Création d’une application simple qui utilise une base de données Redis</h2>
 <h2>Prerequis pour ce projet</h2>

    - Avoir une base en programmation Java
    - Comprendre les bénéfices et les limites des bases nosql
    - Comprendre les différents types de bases nosql
    - Réaliser une application en utilisant une API comme Morphia proche de JPA en se plaçant
      dans un cadre classique de développement au dessus d’une base orientée document comme Mongo.
    - Une base dans la gestion de dependance avec Maven serait un plus.

<h2>Technologies utilisées</h2>

    Morphia
    Pattern DAO
    Jedis

<h2>Deploiement</h2>

    Cloner le projet avec le lien de github
    S'assurer que Maven est installé sur notre machine
    Importer le projet cloné en cliquant sur File > Import > Maven > Existing maven project

    Telecharger Installer la base de données Redis
	https://redis.io/download

	Lancer le serveur de données de Redis :

	- redis-server.exe : depuis une ligne de commande windows
	une fois que le serveur demarré, il faut lancer le client avec la commande ci-dessous dans ligne de commande

	-redis-cli

    Créer une base de données du nom de "_tp3_"
    Lancer votre application Maven en cliquant sur Run > Run as > Maven Build >

<h1>Reponse à la Question (fin de la partie Redis)</h1>
<ol>
	<li>
		Les types de données stockées dans Redis sont des clés valeur.Chaque valeur est associée à une clé comme dans les HashMap
    	</li>
	<li>
		On peut enregistrer des valeurs avec leurs clés, et les recupèrer à travers leurs clés.
   	 </li>

</ol>
<h2> Auteurs</h2>

SARR Seynabou</br>
BOUE Melaine


