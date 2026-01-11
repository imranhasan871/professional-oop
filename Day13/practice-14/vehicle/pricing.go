package vehicle

func ApplyDiscount(price float64, rate float64) float64 {
	return price * (1 - rate)
}
