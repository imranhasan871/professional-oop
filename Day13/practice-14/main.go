package main

import (
	"fmt"
	"vehicle-rental/practice-14/vehicle"
)

func main() {

	car := vehicle.Car{
		Vehicle: vehicle.Vehicle{
			Brand:           "Toyota",
			Model:           "Corolla",
			ManufactureYear: 2015,
		},
	}

	bike := vehicle.Bike{
		Vehicle: vehicle.Vehicle{
			Brand:           "Yamaha",
			Model:           "R15",
			ManufactureYear: 2023,
		},
	}

	truck := vehicle.Truck{
		Vehicle: vehicle.Vehicle{
			Brand:           "Volvo",
			Model:           "FH",
			ManufactureYear: 2019,
		},
	}

	rentables := []vehicle.Rentable{
		&car,
		&bike,
		&truck,
	}

	days := 10

	for _, r := range rentables {
		fmt.Printf("Total rent for %d days: $%.2f\n", days, r.DailyRent(days))
	}

}
