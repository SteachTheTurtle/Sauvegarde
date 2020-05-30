package com.steachtheturtle.flux;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Flux {

	public static void main(String[] args) {

		/*
		 * // Création de l'objet File File f = new File("Text.txt");
		 * System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		 * System.out.println("Nom du fichier : " + f.getName());
		 * System.out.println("Est-ce qu'il existe ? " + f.exists());
		 * System.out.println("Est-ce un répertoire ? " + f.isDirectory());
		 * System.out.println("Est-ce un fichier ? " + f.isFile());
		 *
		 * System.out.println("Affichage des lecteurs à la racine du PC : "); for (File
		 * file : f.listRoots()) { System.out.println(file.getAbsolutePath()); try { int
		 * i = 1; // On parcourt la liste des fichiers et répertoires for (File nom :
		 * file.listFiles()) { // S'il s'agit d'un dossier, on ajoute un "/"
		 * System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" :
		 * nom.getName()));
		 *
		 * if ((i % 5) == 0) { System.out.print("\n"); } i++; }
		 * System.out.println("\n"); } catch (NullPointerException e) { // L'instruction
		 * peut générer une NullPointerException // s'il n'y a pas de sous-fichier ! } }
		 */

		/*
		 * // Création de l'objet File File f = new File("Text.txt");
		 * System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		 *
		 * // Nous déclarons nos objets en dehors du bloc try/catch FileInputStream fis
		 * = null; FileOutputStream fos = null;
		 *
		 * try { // On instancie nos objets : // fis va lire le fichier // fos va écrire
		 * dans le nouveau ! fis = new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text.txt"
		 * ));
		 *
		 * fos = new FileOutputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text2.txt"
		 * ));
		 *
		 * // On crée un tableau de byte pour indiquer le nombre de bytes lus à //
		 * chaque tour de boucle byte[] buf = new byte[8];
		 *
		 * // On crée une variable de type int pour y affecter le résultat de // la
		 * lecture // Vaut -1 quand c'est fini int n = 0;
		 *
		 * // Tant que l'affectation dans la variable est possible, on boucle // Lorsque
		 * la lecture du fichier est terminée l'affectation n'est // plus possible ! //
		 * On sort donc de la boucle while ((n = fis.read(buf)) >= 0) { // On écrit dans
		 * notre deuxième fichier avec l'objet adéquat fos.write(buf); // On affiche ce
		 * qu'a lu notre boucle au format byte et au // format char for (byte bit : buf)
		 * { System.out.print("\t" + bit + "(" + (char) bit + ")"); }
		 * System.out.println(""); // Nous réinitialisons le buffer à vide // au cas où
		 * les derniers byte lus ne soient pas un multiple de 8 // Ceci permet d'avoir
		 * un buffer vierge à chaque lecture et ne pas avoir de // doublon en fin de
		 * fichier buf = new byte[8];
		 *
		 * } System.out.println("Copie terminée !");
		 *
		 * } catch (FileNotFoundException e) { // Cette exception est levée si l'objet
		 * FileInputStream ne trouve // aucun fichier e.printStackTrace(); } catch
		 * (IOException e) { // Celle-ci se produit lors d'une erreur d'écriture ou de
		 * lecture e.printStackTrace(); } finally { // On ferme nos flux de données dans
		 * un bloc finally pour s'assurer // que ces instructions seront exécutées dans
		 * tous les cas même si // une exception est levée ! try { if (fis != null)
		 * fis.close(); } catch (IOException e) { e.printStackTrace(); }
		 *
		 * try { if (fos != null) fos.close(); } catch (IOException e) {
		 * e.printStackTrace(); } }
		 */

		/*
		 * // Nous déclarons nos objets en dehors du bloc try/catch FileInputStream fis;
		 * BufferedInputStream bis; try { fis = new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Dictionnaire.txt"
		 * )); bis = new BufferedInputStream(new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Dictionnaire.txt"
		 * ))); byte[] buf = new byte[8];
		 *
		 * // On récupère le temps du système long startTime =
		 * System.currentTimeMillis(); // Inutile d'effectuer des traitements dans notre
		 * boucle while (fis.read(buf) != -1) ; // On affiche le temps d'exécution
		 * System.out.println("Temps de lecture avec FileInputStream : " +
		 * (System.currentTimeMillis() - startTime));
		 *
		 * // On réinitialise startTime = System.currentTimeMillis(); // Inutile
		 * d'effectuer des traitements dans notre boucle while (bis.read(buf) != -1) ;
		 * // On réaffiche System.out
		 * .println("Temps de lecture avec BufferedInputStream : " +
		 * (System.currentTimeMillis() - startTime));
		 *
		 * // On ferme nos flux de données fis.close(); bis.close();
		 *
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		/*
		 *
		 * FileInputStream fis; FileOutputStream fos; BufferedInputStream bis;
		 * BufferedOutputStream bos;
		 *
		 * try { fis = new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Dictionnaire.txt"
		 * )); fos = new FileOutputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text3.txt"
		 * )); bis = new BufferedInputStream(new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Dictionnaire.txt"
		 * ))); bos = new BufferedOutputStream(new FileOutputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text4.txt"
		 * ))); byte[] buf = new byte[8];
		 *
		 * // On récupère le temps du système long startTime =
		 * System.currentTimeMillis();
		 *
		 * while (fis.read(buf) != -1) { fos.write(buf); } // On affiche le temps
		 * d'exécution System.out.
		 * println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : "
		 * + (System.currentTimeMillis() - startTime));
		 *
		 * // On réinitialise startTime = System.currentTimeMillis();
		 *
		 * while (bis.read(buf) != -1) { bos.write(buf); } // On réaffiche System.out.
		 * println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : "
		 * + (System.currentTimeMillis() - startTime));
		 *
		 * // On ferme nos flux de données fis.close(); bis.close(); fos.close();
		 * bos.close();
		 *
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		/*
		 * // Nous déclarons nos objets en dehors du bloc try/catch DataInputStream dis;
		 * DataOutputStream dos; try { dos = new DataOutputStream(new
		 * BufferedOutputStream(new FileOutputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/sdz.txt"
		 * ))));
		 *
		 * // Nous allons écrire chaque type primitif dos.writeBoolean(true);
		 * dos.writeByte(100); dos.writeChar('C'); dos.writeDouble(12.05);
		 * dos.writeFloat(100.52f); dos.writeInt(1024); dos.writeLong(123456789654321L);
		 * dos.writeShort(2); dos.close();
		 *
		 * // On récupère maintenant les données ! dis = new DataInputStream(new
		 * BufferedInputStream(new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/sdz.txt"
		 * ))));
		 *
		 * System.out.println(dis.readBoolean()); System.out.println(dis.readByte());
		 * System.out.println(dis.readChar()); System.out.println(dis.readDouble());
		 * System.out.println(dis.readFloat()); System.out.println(dis.readInt());
		 * System.out.println(dis.readLong()); System.out.println(dis.readShort());
		 *
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		/*
		 *
		 * // Nous déclarons nos objets en dehors du bloc try/catch ObjectInputStream
		 * ois; ObjectOutputStream oos; try { oos = new ObjectOutputStream(new
		 * BufferedOutputStream(new FileOutputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/game.txt"
		 * ))));
		 *
		 * // Nous allons écrire chaque objet Game dans le fichier oos.writeObject(new
		 * Game("Assassin Creed", "Aventure", 45.69)); oos.writeObject(new
		 * Game("Tomb Raider", "Plateforme", 23.45)); oos.writeObject(new Game("Tetris",
		 * "Stratégie", 2.50)); // Ne pas oublier de fermer le flux ! oos.close();
		 *
		 * // On récupère maintenant les données ! ois = new ObjectInputStream(new
		 * BufferedInputStream(new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/game.txt"
		 * ))));
		 *
		 * try { System.out.println("Affichage des jeux :");
		 * System.out.println("*************************\n"); System.out.println(((Game)
		 * ois.readObject()).toString()); System.out.println(((Game)
		 * ois.readObject()).toString()); System.out.println(((Game)
		 * ois.readObject()).toString()); } catch (ClassNotFoundException e) {
		 * e.printStackTrace(); }
		 *
		 * ois.close();
		 *
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		/*
		 * CharArrayWriter caw = new CharArrayWriter(); CharArrayReader car;
		 *
		 * try { caw.write("Coucou les Zéros"); // Appel à la méthode toString de notre
		 * objet de manière tacite System.out.println(caw);
		 *
		 * // caw.close() n'a aucun effet sur le flux // Seul caw.reset() peut tout
		 * effacer caw.close();
		 *
		 * // On passe un tableau de caractères à l'objet qui va lire le tampon car =
		 * new CharArrayReader(caw.toCharArray()); int i; // On remet tous les
		 * caractères lus dans un String String str = ""; while ((i = car.read()) != -1)
		 * str += (char) i;
		 *
		 * System.out.println(str);
		 *
		 * } catch (IOException e) { e.printStackTrace(); }
		 *
		 * StringWriter sw = new StringWriter(); StringReader sr;
		 *
		 * try { sw.write("Coucou les Zéros"); // Appel à la méthode toString de notre
		 * objet de manière tacite System.out.println(sw);
		 *
		 * // caw.close() n'a aucun effet sur le flux // Seul caw.reset() peut tout
		 * effacer sw.close();
		 *
		 * // On passe un tableau de caractères à l'objet qui va lire le tampon sr = new
		 * StringReader(sw.toString()); int i; // On remet tous les caractères lus dans
		 * un String String str = ""; while ((i = sr.read()) != -1) str += (char) i;
		 *
		 * System.out.println(str);
		 *
		 * } catch (IOException e) { e.printStackTrace(); }
		 *
		 * File file = new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/TestFileWriter.txt"
		 * ); FileWriter fw; FileReader fr;
		 *
		 * try { // Création de l'objet fw = new FileWriter(file); String str =
		 * "Bonjour à tous, amis Zéros !\n"; str += "\tComment allez-vous ? \n"; // On
		 * écrit la chaîne fw.write(str); // On ferme le flux fw.close();
		 *
		 * // Création de l'objet de lecture fr = new FileReader(file); str = ""; int i
		 * = 0; // Lecture des données while ((i = fr.read()) != -1) str += (char) i;
		 *
		 * // Affichage System.out.println(str);
		 *
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		/*
		 * FileInputStream fis; BufferedInputStream bis; FileChannel fc;
		 *
		 * try { // Création des objets fis = new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Dictionnaire.txt"
		 * )); bis = new BufferedInputStream(fis); // Démarrage du chrono long time =
		 * System.currentTimeMillis(); // Lecture while (bis.read() != -1) ; // Temps
		 * d'exécution System.out
		 * .println("Temps d'exécution avec un buffer conventionnel : " +
		 * (System.currentTimeMillis() - time));
		 *
		 * // Création d'un nouveau flux de fichier fis = new FileInputStream(new File(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Dictionnaire.txt"
		 * )); // On récupère le canal fc = fis.getChannel(); // On en déduit la taille
		 * int size = (int) fc.size(); // On crée un buffer correspondant à la taille du
		 * fichier ByteBuffer bBuff = ByteBuffer.allocate(size);
		 *
		 * // Démarrage du chrono time = System.currentTimeMillis(); // Démarrage de la
		 * lecture fc.read(bBuff); // On prépare à la lecture avec l'appel à flip
		 * bBuff.flip(); // Affichage du temps d'exécution
		 * System.out.println("Temps d'exécution avec un nouveau buffer : " +
		 * (System.currentTimeMillis() - time));
		 *
		 * // Puisque nous avons utilisé un buffer de byte afin de récupérer les données
		 * // Nous pouvons utiliser un tableau de byte // La méthode array retourne un
		 * tableau de byte byte[] tabByte = bBuff.array();
		 *
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */

		/*
		 * try (FileInputStream fis = new FileInputStream(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text.txt"
		 * ); FileOutputStream fos = new FileOutputStream(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text2.txt"
		 * )) { byte[] buf = new byte[8]; int n = 0; while ((n = fis.read(buf)) >= 0) {
		 * fos.write(buf); for (byte bit : buf) System.out.print("\t" + bit + "(" +
		 * (char) bit + ")");
		 *
		 * System.out.println(""); }
		 *
		 * System.out.println("Copie terminée !");
		 *
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

		// On récupère maintenant la liste des répertoires dans une collection typée
		// Via l'objet FileSystem qui représente le système de fichier de l'OS
		// hébergeant la JVM
		Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

		// Maintenant, il ne nous reste plus qu'à parcourir
		for (Path chemin : roots) {
			System.out.println(chemin);
			// Pour lister un répertoire, il faut utiliser l'objet DirectoryStream
			// L'objet Files permet de créer ce type d'objet afin de pouvoir l'utiliser
			// try (DirectoryStream<Path> listing = Files.newDirectoryStream(chemin)) {
			try (DirectoryStream<Path> listing = Files.newDirectoryStream(chemin, "*")) {

				int i = 0;
				for (Path nom : listing) {
					System.out.print("\t" + ((Files.isDirectory(nom)) ? nom + "/" : nom));
					i++;
					if (i % 8 == 0)
						System.out.println("\n");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Path source = Paths
				.get("/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text.txt");
		Path cible = Paths
				.get("/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text2.txt");
		try {
			Files.copy(source, cible, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * Path source = Paths .get(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text2.txt"
		 * ); Path cible = Paths .get(
		 * "/home/yannick/Bureau/Git/Sauvegarde/OpenClassrooms/Java/src/com/steachtheturtle/flux/Text3.txt"
		 * ); try { Files.move(source, cible, StandardCopyOption.REPLACE_EXISTING); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */

		/*
		 * // Création d'un système de fichiers en fonction d'un fichier ZIP try
		 * (FileSystem zipFS = FileSystems.newFileSystem(Paths.get("monFichier.zip"),
		 * null)) {
		 * 
		 * //Suppression d'un fichier à l'intérieur du ZIP : Files.deleteIfExists(
		 * zipFS.getPath("test.txt") );
		 * 
		 * //Création d'un fichier à l'intérieur du ZIP : Path path =
		 * zipFS.getPath("nouveau.txt"); String message = "Hello World !!!";
		 * Files.write(path, message.getBytes());
		 * 
		 * //Parcours des éléments à l'intérieur du ZIP : try (DirectoryStream<Path>
		 * stream = Files.newDirectoryStream(zipFS.getPath("/"))) { for (Path entry :
		 * stream) { System.out.println(entry); } }
		 * 
		 * //Copie d'un fichier du disque vers l'archive ZIP :
		 * Files.copy(Paths.get("fichierSurDisque.txt"),
		 * zipFS.getPath("fichierDansZIP.txt")); }
		 */

	}
}
