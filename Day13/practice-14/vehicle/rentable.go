package vehicle

type Rentable interface {
	DailyRent(days int) float64
}
