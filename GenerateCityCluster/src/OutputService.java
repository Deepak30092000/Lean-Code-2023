import java.util.List;
public class OutputService {

    public static void printCityData(CityData[] cities){
        for(int index=0; index < cities.length; index++){
            System.out.println((index+1) + ": "+cities[index].cityName + "   " + cities[index].latitude + "   " + cities[index].longitude);
        }
    }
    public static void printClustersOfCities(List<String> clusters){
        for(int index = 0; index < clusters.size(); index++){
            System.out.println("Cluster "+ (index+1) + ":\t" + clusters.get(index) + "\n");
        } 
    }
    
}
