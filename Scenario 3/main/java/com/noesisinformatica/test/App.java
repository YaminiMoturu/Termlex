package com.noesisinformatica.test;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        DataService dataService = new DataService();
        dataService.createConnection();
        dataService.createTable();
        System.out.println( "Number of terms : " + dataService.getAllTerm().size());
       dataService.saveTerm("Term from app");
    }
}
