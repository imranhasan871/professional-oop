package vehicle

const (
	carBaseRentalRate   = 50.0
	carAgeThresholdDays = 5
	carDiscountRate     = 0.10
)

type Car struct {
	Vehicle
}

func (c *Car) DailyRent(days int) float64 {
	pricePerDay := carBaseRentalRate

	if c.Age() > carAgeThresholdDays {
		pricePerDay = ApplyDiscount(pricePerDay, carDiscountRate)
	}

	return pricePerDay * float64(days)
}
