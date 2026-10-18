import junit.framework.TestCase;

public class TestSchedule extends TestCase{
    public void testConstructor(){
        TrainKind k1 = new Local(350, 50);
        AList e = new EmptyList();
        AList a1 = new ConsList(new Stop(new Station("Thu Duc", new Location("Xa Lo Ha Noi", "Vo Van Ngan")), new Time(10,10)),e);

        TrainSchedule s1 = new TrainSchedule(new Station("Suoi Tien", new Location("Hoang Huu Nam", "Song Hanh Xa Lo Ha Noi")), new Station("Ben Thanh", new Location("Le Loi", "Tran Hung Dao")), new Time(22,45), new Time(23,50),k1,a1);
    }
}