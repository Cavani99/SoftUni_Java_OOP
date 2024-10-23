package Hotel_Reservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private String season;
    private String discountType;

    enum Season_Weight {
        Autumn(1), Spring(2), Winter(3), Summer(4);
        private int size;
        Season_Weight(int size) {
            this.size = size;
        }
        public int getValue() { return this.size; }
    }

    enum Discount {
        VIP(0.2), SecondVisit(0.1),None(0);
        private double percent;
        Discount(double percent) {
            this.percent = percent;
        }
        public double getValue() { return this.percent; }
    }


    public double calculate(){
        double sum = pricePerDay * days * Season_Weight.valueOf(season).getValue();

        sum = sum - sum * Discount.valueOf(discountType).getValue();

        return sum;
    }

    public PriceCalculator(double pricePerDay, int days, String season, String discountType){
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }
}
