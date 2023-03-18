package AirlineProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class City {
    String name;
    String id;
    int index;
    LinkedList<City> connectedCity = new LinkedList<>();

    public City(int i, String name, String id) {
        index = i;
        this.name = name;
        this.id = id;
    }
}

public class MyAirline{
     static void Welcome(){

         System.out.println();
         System.out.println();
         System.out.println("--------------------------------********** Welcome to 'Nafis' Airlines **********-------------------------------------");
         System.out.println();
         System.out.println();
     }
    int size =0;
    List<City> cities = new ArrayList<>();

    void addingCity(String id, String name){
        int i = size++;
        City city = new City(i,name, id);
        cities.add(city);
    }

    City cityfinding(String id){
        for(City c:cities){
            if(c.id.equalsIgnoreCase(id)){
                return c;
            }
        }
        return null;
    }

    void connectCity(String id1, String id2){
        City c1 = cityfinding(id1);
        City c2 = cityfinding(id2);
        if( c1 == null || c2 == null){
            System.out.println("Cannot connect, wrong city id.");
            return;
        }
        c1.connectedCity.add(c2);
    }

    private void findBFSpath(String code) {
        boolean[] visited = new boolean[size];
        City city = cityfinding(code);
        System.out.println("\n\n printing the intermediate path using BFS from city "+ city.name);
        LinkedList<City> q = new LinkedList<>();
        q.add(city);
        visited[city.index] = true;

        while(!q.isEmpty()){
            City currentCity = q.poll();
            System.out.print(" >> "+ currentCity.name);


            for(City cc:currentCity.connectedCity){
                if(!visited[cc.index]){
                    visited[cc.index] = true;
                    q.add(cc);
                }
            }


        }

    }
    private void DFS(City city, boolean[] visited) {
        visited[city.index] = true;
        for(City c :city.connectedCity){
            if(!visited[c.index]){
                DFS(c,visited);
            }
        }
        System.out.println(" >> "+city.name);
    }
    private void findDFSpath(String code) {
        boolean[] visited = new boolean[size];
        City city = cityfinding(code);
        System.out.println("\n printing the intermediate path using DFS  from city "+ city.name);
        DFS(city, visited);
    }
    public static void main(String[] args) {
        Welcome();

        MyAirline g = new MyAirline();


        g.addingCity("CTG","Chittagong");
        g.addingCity("DH","Dhaka");
        g.addingCity("KU","Kumilla");
        g.addingCity("JS","jossore");
        g.addingCity("SY","Sylhet");
        g.addingCity("RN","Rangpur");


        g.connectCity("RN","SY");
        g.connectCity("SY", "JS");
        g.connectCity("JS","KU");
        g.connectCity("JS","CTG");
        g.connectCity("KU", "DH");
        g.connectCity("KU", "CTG");
        g.connectCity("KU", "JS");


        g.findDFSpath("RN");
        g.findDFSpath("KU");


        g.findBFSpath("RN");
        g.findBFSpath("KU");


    }



}
