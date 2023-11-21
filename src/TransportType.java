import java.sql.SQLOutput;

public enum TransportType {
    BMW{
        @Override
        public double calculateTravelCost(double distance) {
           return distance;
        }
    },
    HONDA{
        @Override
        public double calculateTravelCost(double distance) {
            return distance;
        }
    },
    VOLKSWAGEN{
        @Override
        public double calculateTravelCost(double distance) {
            return distance;
        }
    },
    FORD{
        @Override
        public double calculateTravelCost(double distance) {
            return distance;
        }
    },
    HYUNDAI{
        @Override
        public double calculateTravelCost(double distance) {
            return distance;
        }
    },
    AUDI{
        @Override
        public double calculateTravelCost(double distance) {
            return distance;
        }
    },
    PORSCHE{
        @Override
        public double calculateTravelCost(double distance) {
            return distance;
        }
    };
    public abstract double calculateTravelCost(double distance);

}
