import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;  
public class CityDataGetter {
public static CityData[] getCityData(int totalCities) {  
String line = "";  
String splitBy = ",";  
try{  
BufferedReader br = new BufferedReader(new FileReader("CitiesData.csv"));  
CityData[] cities = new CityData[totalCities];
int index=0;
while (((line = br.readLine()) != null)&&(index<totalCities)) {  
   String[] cityData = line.split(splitBy);    // use comma as separator  ]
        cities[index++] = new CityData(cityData[0], Float.parseFloat(cityData[1]), Float.parseFloat(cityData[2]));
}
br.close();
return cities;  
}   
catch (IOException e){  
e.printStackTrace();  
return null;
}
}     
}
