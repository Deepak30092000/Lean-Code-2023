import java.util.List;

public class Main {

    public static void main(String args[])
    {
        CityData[] cities=CityDataGetter.getCityData(200);
        List<String> clustersOfCities = CityClusterGenerator.generateCityCluster(cities,10);
       // OutputService.printCityData(cities);
        OutputService.printClustersOfCities(clustersOfCities);
        
    }
    
}
