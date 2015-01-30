//Cuong Nguyen
//
//lab02-Cyclometer
//
//Cyclometer.java
//
//My bicycle cyclometer (meant to measure speed, distance, etc.)
//
//  a. print the number of minutes for each trip
//  b. print the number of ounts for each trip
//  c. print the istance of each trip in miles
//  d. print the distance for the two trips combined

//
//
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        //initial time and counts of trip
        int secsTrip1=480;  //initial time of Trip1 in sec
        int secsTrip2=3220; //initial time of Trip2 in sec
        int countsTrip1=1561;   //initial count Trip1
        int countsTrip2=9037;   //initial count Trip2
        
        //intermediate variables and output data
        
        double wheelDiameter=27.0,  //unit conversion
        PI=3.14159, //unit conversion
        feetPerMile=5280,   //unit conversion
        inchesPerFoot=12,   //unit conversion
        secondsPerMinute=60;    //unit conversion
        double distanceTrip1, distanceTrip2, totalDistance;
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
                System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        //run calculations; store the values. Document your
        //calculation here. 
        //
        //
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //  Above gievs distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches timse PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;   //  Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
    }   // main method required for every Java program
}   //end of class


