# TP 2 – Application e-commerce

**Solayman Oumouou – II-BDCC3**

## Structure du projet

Le projet `ecom-ms-app` est organisé en six microservices. La capture montre leurs dossiers et le dossier `config-repo`.

![Structure du projet ecom-ms-app](Screenshots/structure.png)

## Service clients

J’ai testé la connexion à la base H2 `customers-db` depuis la console du service sur le port `8081`. La console affiche le message « Test successful ».

![Test de connexion à la base H2 des clients](Screenshots/img.png)

J’ai ensuite ouvert `http://localhost:8081/customers` dans le navigateur. La réponse JSON contient trois clients, avec leur nom et leur adresse e-mail.

![Liste des trois clients au format JSON](Screenshots/img_1.png)

## Service inventaire

Dans la console H2 du service sur le port `8082`, j’ai exécuté la requête `SELECT * FROM PRODUCT;` sur la base `products-db`. Le résultat contient trois produits avec leur prix et leur quantité en stock.

![Résultat de la requête sur la table PRODUCT dans H2](Screenshots/img_2.png)

J’ai retrouvé les mêmes produits au format JSON en ouvrant `http://localhost:8082/products`.

![Liste des produits au format JSON](Screenshots/img_3.png)
