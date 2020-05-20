#!/bin/bash

# echo -e "\n"
# message='Bonjour tout le monde\n'

# echo -e $message
# message2=`pwd`
# echo -e "Vous êtes dans le dossier $message2 \n\nQuel est votre nom ?"

# read -p 'Entrez votre nom : ' nom
# echo -e "\nBonjour $nom !\n"

# read -p 'Entrez votre login (5 caractères max) : ' -n 5 nom
# echo -e "\nBonjour $nom !"

# read -p 'Entrez le code de désamorçage de la bombe (vous avez 5 secondes) : '  -t 5 code
# echo -e "\nBoum !"

# read -p 'Entrez votre mot de passe : ' -s pass
# echo -e "\nMerci ! Je vais dire à tout le monde que votre mot de passe est $pass

let "a = 5"
let "b = 2"
let "c = a + b"
echo $c

let "a = 5 * 3" # $a = 15
let "a = 4 ** 2" # $a = 16 (4 au carré)
let "a = 8 / 2" # $a = 4
let "a = 10 / 3" # $a = 3
let "a = 10 % 3" # $a = 1

echo "Vous avez lancé $0, il y a $# paramètres"
echo "Le paramètre 1 est $1"

shift #Permet de décaler le paramètre d'entrée
echo "Le paramètre 1 est maintenant $1"

tableau=('valeur0' 'valeur1' 'valeur2')
echo ${tableau[2]} #Permet d'accèder à la variable 'valeur2' du tableau
tableau[5]='valeur5'

echo ${tableau[*]}

nom="Bruno"

if [ $nom = "Bruno" ]
then
        echo "Salut Bruno !"
elif [ $nom = "Mars" ]
then
        echo "Salut Mars !"
else
	echo "Ouch!"
fi

# Test de paramètres vide
if [ -z $1 ]
then
        echo "Pas de paramètre"
else
        echo "Paramètre présent"
fi

# Test de paramètre non vide
if [ -n $1 ]
then
        echo "Paramètre présent"
else
        echo "Pas de paramètre"
fi

while [ -z $reponse ] || [ $reponse != 'oui' ]
do
        read -p 'Dites oui : ' reponse
done

for variable in 'valeur1' 'valeur2' 'valeur3'
do
        echo "La variable vaut $variable"
done

liste_fichiers=`ls`

for fichier in $liste_fichiers
do
        echo "Fichier trouvé : $fichier"
done

for i in `seq 1 2 10`;
do
        echo $i
done

# déclaration méthode 1
maFonction1 ()

{
	echo -e "Méthode 1\n" 
}

#appel de ma fonction

maFonction1

# déclaration méthode 2

function maFonction2

{
	echo -e "Méthode 2\n" 
}

#appel de la fonction

maFonction2

