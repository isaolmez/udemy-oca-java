package oca.section2.lecture1;
class TravelPlannerReworked {
	void planTravel(Customer c){}
}

class TravelDestinations {
	Destination[] getDestinations(Customer c){ return null; }
	Destination[] compareDestinations(Destination[] dests){ return null; }
}

class TravelFinance {
	Price[] getPrices(Destination[] destinations){ return null; }
	Price[] calculateTaxes(Price[] prices){ return null; }
}

class CustomerRelations {
	void contactToCustomer(Customer c){}
	void informCustomer(Customer c){}
}


// Model classes
class Customer {}
class Destination {}
class Price {}
