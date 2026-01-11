package vehicle

const (
	bikeBaseRentalRate   = 20.0
	bikeAgeThresholdDays = 7
	bikeDiscountRate     = 0.15
)

type Bike struct {
	Vehicle
}

func (b *Bike) DailyRent(days int) float64 {
	total := bikeBaseRentalRate * float64(days)

	if b.Age() > bikeAgeThresholdDays {
		total = ApplyDiscount(total, bikeDiscountRate)
	}

	return total
}
