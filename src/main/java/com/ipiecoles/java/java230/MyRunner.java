package com.ipiecoles.java.java230;

import java.sql.ResultSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mysql.jdbc.Statement;

@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
    	/*String url = "jdbc:mysql://localhost:3306/entreprise";
    	String user = "root"; String pwd = "";
    	java.sql.Connection connexion = null;
    	try {
    	    connexion = java.sql.DriverManager.getConnection(url, user, pwd);
    	} catch ( java.sql.SQLException e ) {
    	    //Problème de connexion à la base !
    	}
    	//L'object connexion va nous permettre d'effectuer des requêtes...

    	//La variable de type Statement permettra de gérer des requêtes SQL
    	java.sql.Statement statement = connexion.createStatement();

    	//La variable de type ResultSet contiendra les résultats de la requêtes
    	String query = "SELECT * FROM employe";
    	ResultSet resultSet = statement.executeQuery(query);

    	//On parcours un à un les résultats grâche à next() qui renvoie un booléen
    	//précisant s'il y a une ligne suivante dans nos résultats et récupère ce 
    	//résultat le cas échéant (au début, son curseur est situé avant le premier élément).
    	while(resultSet.next()){
    	  System.out.println("nom : " + resultSet.getString("nom"));
    	  System.out.println("prenom : " + resultSet.getString("prenom"));
    	}
    	//Lorsqu'on a fini de l'utiliser : 
    	if(connexion != null) {
    	  try {
    	    connexion.close();
    	  }
    	  catch ( java.sql.SQLException e ) {
    	    //Problème de déconnexion, ce n'est pas très grave...
    	  }
    	}
    	*/

    }

    public static void print(Object t) {
        System.out.println(t);
    }
}
