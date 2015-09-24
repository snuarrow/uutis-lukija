
package com.mycompany.uutislukija;

import com.mycompany.hackernewsuutiset.HackerPaivanUutiset;
import static spark.Spark.*;

// diff

public class Main {
    public static void main(String[] args){
        
        
        port(5678);
        
        HackerPaivanUutiset hakija = new HackerPaivanUutiset();
        
        
        get("/", (req, res) -> {
           return "<!doctype html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <title>Hackernews-uutiset</title>\n" +
"</head>\n" +
"<body>\n" +
"    <h1>Hackernews-uutiset</h1>\n" +
"                    \n" +
"<a href='suosituin'>suosituin</a> <br>\n" +
"<a href='viimeisin'>viimeisin</a></body>\n" +
"</html>"; 
        });
        get("/viimeisin", (req, res) -> hakija.haeViimeisinUutinen());
        get("/suosituin", (req, res) -> hakija.haeSuosituinUutinen());
        
        
//        
//        if(args.length == 0 || args[0].isEmpty()){
//            System.out.println("Et antanut komentoa. Käytettävissä olevat komennot: " + komennot());
//        } else if(args[0].equals("viimeisin")){
//            System.out.println(hakija.haeViimeisinUutinen());
//        } else if(args[0].equals("suosituin")){
//            System.out.println(hakija.haeSuosituinUutinen());
//        }
    }
    
    public static String komennot(){
        return "Komennot: viimeisin, suosituin";
    }
}
