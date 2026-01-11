package vehicle

const (
	truckBaseRentalRate   = 100.0
	truckAdditionalCharge = 100.0
	truckThresholdDays    = 1
)

type Truck struct {
	Vehicle
}

func (t *Truck) DailyRent(days int) float64 {
	total := truckBaseRentalRate * float64(days)

	if days > truckThresholdDays {
		total += truckAdditionalCharge * float64(days-truckThresholdDays)
	}

	return total
}
