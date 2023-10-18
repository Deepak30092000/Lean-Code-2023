import java.util.ArrayList;
import java.util.List;

public class CityClusterGenerator {
      
    private static float CalculateHaversineDistance(CityData locationOne, CityData locationTwo)
        {
            float earthRadius = 6371; // Earth's radius in kilometers

            float latitudeDifference = locationTwo.latitude - locationOne.latitude;
            float longitudeDifference = locationTwo.longitude - locationTwo.longitude;

            float centralAngle = (float) (Math.sin(latitudeDifference / 2) * Math.sin(latitudeDifference / 2) +
                       Math.cos(locationOne.latitude) * Math.cos(locationTwo.latitude) *
                       Math.sin(longitudeDifference / 2) * Math.sin(longitudeDifference / 2));

            float distance = (float) (2 * Math.atan2((float)Math.sqrt(centralAngle),(float) Math.sqrt(1 - centralAngle)));

            return earthRadius * distance;
        }

     private static boolean isAddable(CityData city1, CityData city2, int radius){
        if(Math.abs(CalculateHaversineDistance(city1, city2)) <= radius*111){
          return true;
        }
        return false;
     }
    public static List<String> generateCityCluster(CityData[] cities, int radius)
    {
     List<String> clustersOfCities = new ArrayList<String>();
     int totalCities = cities.length;
     boolean[] isAddedCityInCluster = new boolean[totalCities];
        for(int index1 = 0; index1 < totalCities; index1++){
            if(!isAddedCityInCluster[index1]){
             String clusterOfCities = cities[index1].cityName + ", ";   
             for(int index2 = index1 + 1; index2 < totalCities && !isAddedCityInCluster[index2]; index2++){
                if(isAddable(cities[index1], cities[index2], radius)){
                   clusterOfCities += cities[index2].cityName;
                   isAddedCityInCluster[index2] = true;
                   clusterOfCities += ", ";
                }
             }
            clustersOfCities.add(clusterOfCities);
            }
        }
        return clustersOfCities;
    } 
}
