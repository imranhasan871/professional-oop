package vehicle

import "time"

type Vehicle struct {
	Brand           string
	Model           string
	ManufactureYear int
}

func (v *Vehicle) Age() int {
	return time.Now().Year() - v.ManufactureYear
}
