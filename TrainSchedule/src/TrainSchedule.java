public class TrainSchedule {
    private Station departureStation;
    private Station arrivalStation;
    private Time departureTime;
    private Time arrivalTime;
    private TrainKind kind;
    private AList stops;

     public TrainSchedule(Station departureStation, Station arrivalStation, Time departureTime, Time arrivalTime, TrainKind kind, AList stops) {
         this.departureStation = departureStation;
         this.arrivalStation = arrivalStation;
         this.departureTime = departureTime;
         this.arrivalTime = arrivalTime;
         this.kind=kind;
         this.stops=stops;
     }
}
