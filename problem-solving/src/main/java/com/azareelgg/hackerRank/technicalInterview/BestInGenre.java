package com.azareelgg.hackerRank.technicalInterview;

import java.io.*;
import java.util.*;
import java.net.*;
import com.google.gson.*;


public class BestInGenre {

    public static void main(String[] args) throws MalformedURLException, IOException{
        System.out.println(bestInGenre("Action"));
    }

    /*
     * Complete the 'bestInGenre' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING genre as parameter.
     *
     * Base URL: https://jsonmock.hackerrank.com/api/tvseries?page=
     */

    public static String bestInGenre(String genre)throws IOException, MalformedURLException{
    // The solution is right, 
    // Improve is missing to avoid 

    URL url;
    InputStreamReader reader;
    Response response = new Response();
    List<Item> data = new ArrayList<>();
    int i = 1;
    do{
        url = new URL("https://jsonmock.hackerrank.com/api/tvseries?page=" + i);
        reader = new InputStreamReader(url.openStream());
        response = new Gson().fromJson(reader, Response.class);
        i++;
        data.addAll(response.getData());
    }while(response.getPage() < response.getTotal_pages());
    
    Item ret = data.stream().filter(g -> g.getGenre().contains(genre))
                 .sorted(Comparator.comparing(Item::getName))
                 .findFirst().orElse(new Item());

    return ret.getName();
    }

}

class Response{
    int page;
    int per_page;
    int total;
    int total_pages;
    List<Item> data;
    
    public int getPage(){
        return this.page;
    }
    public void setPage(int page){
        this.page = page;
    }
    public int getPer_page(){
        return this.per_page;
    }
    public void setPer_page(int per_page){
        this.per_page = per_page;
    }
    public int getTotal(){
        return this.total;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal_pages(){
        return this.total_pages;
    }
    public void setTotal_pages(int total_pages){
        this.total_pages = total_pages;
    }
    public List<Item> getData(){
        if(this.data == null){
            return new ArrayList<>();
        }
        return this.data;
    }
    public void setData(List<Item> data){
        this.data = data;
    }
}

class Item{
    String name;
    String runtime_of_series;
    String certificate;
    String runtime_of_episodes;
    String genre;
    double imdb_rating;
    String overview;
    long no_of_votes;
    int id;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRuntime_of_series(){
        return this.runtime_of_series;
    }
    public void setRuntime_of_series(String runtime_of_series){
        this.runtime_of_series = runtime_of_series;
    }
    public String getCertificate(){
        return this.certificate;
    }
    public void setCertificate(String certificate){
        this.certificate = certificate;
    }    
    public String getRuntime_of_episodes(){
        return this.runtime_of_episodes;
    }
    public void setRuntime_of_episodes(String runtime_of_episodes){
        this.runtime_of_episodes = runtime_of_episodes;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public double getImdb_rating(){
        return this.imdb_rating;
    }
    public void setImdb_rating(double imdb_rating){
        this.imdb_rating = imdb_rating;
    }
    public String getOverview(){
        return this.overview;
    }
    public void setOverview(String overview){
        this.overview = overview;
    }
    public long getNo_of_votes(){
        return this.no_of_votes;
    }
    public void setNo_of_votes(long no_of_votes){
        this.no_of_votes = no_of_votes;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
}



/*
Enter your query here.
Please append a semicolon ";" at the end of the query
*/

/*
SELECT DISTINCT p.name AS "PROFESSOR.NAME", c.name AS "COURSE.NAME"ba
FROM professor p
INNER JOIN schedule s
ON s.professor_id = p.id
INNER JOIN course c
ON s.course_id = c.id
where c.department_id <> p.department_id
;
*/