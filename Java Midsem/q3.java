package converters.currency;

public class CurrencyConverter {
    public double dollarToGhc(double dollars) {
        return dollars * 12.5; 
    }
    
    public double ghcToDollar(double ghc) {
        return ghc / 12.5;
    }
    
    public double euroToGhc(double euro) {
        return euro * 13.5; 
    }
    
    public double ghcToEuro(double ghc) {
        return ghc / 13.5;
    }
    
    public double yenToGhc(double yen) {
        return yen * 0.085;
    }
    
    public double ghcToYen(double ghc) {
        return ghc / 0.085;
    }
}


package converters.distance;

public class DistanceConverter {
    public double meterToKm(double meters) {
        return meters / 1000;
    }
    
    public double kmToMeter(double km) {
        return km * 1000;
    }
    
    public double milesToKm(double miles) {
        return miles * 1.60934;
    }
    
    public double kmToMiles(double km) {
        return km / 1.60934;
    }
}


package converters.time;

public class TimeConverter {
    public int hoursToMinutes(int hours) {
        return hours * 60;
    }
    
    public int minutesToHours(int minutes) {
        return minutes / 60;
    }
    
    public int hoursToSeconds(int hours) {
        return hours * 3600;
    }
    
    public int secondsToHours(int seconds) {
        return seconds / 3600;
    }
}


public class ConverterDemo {
    public static void main(String[] args) {
        converters.currency.CurrencyConverter cc = new converters.currency.CurrencyConverter();
        converters.distance.DistanceConverter dc = new converters.distance.DistanceConverter();
        converters.time.TimeConverter tc = new converters.time.TimeConverter();
        
        // Example usage
        System.out.println("100 USD = " + cc.dollarToGhc(100) + " GHC");
        System.out.println("1000 meters = " + dc.meterToKm(1000) + " km");
        System.out.println("2 hours = " + tc.hoursToMinutes(2) + " minutes");
    }
}