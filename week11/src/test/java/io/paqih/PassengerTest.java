package io.paqih;



import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PassengerTest {
	private Passenger passenger;
	
	@BeforeEach
	void setUp() throws Exception {
		passenger = new Passenger("Ali", true);
	}

	@Test
	public void testPrintData() {
		Passenger mike = new Passenger("Mike", false);
		
		//cek VIP
		assertFalse(mike.isVip());//bukan VIP
		assertTrue(passenger.isVip());//VIP
		//cek Nama
		assertEquals(mike.getName(), "Mike");//nama dari mike
		assertEquals(passenger.getName(), "Ali");
	}
}
