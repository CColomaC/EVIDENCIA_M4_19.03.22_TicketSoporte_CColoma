package TicketSoporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	// Prueba de Login
		void testLogin() {		
			AppSoporte.inicializar();
			
			boolean test = AppSoporte.procesarLogin("admin", "pass");
			assertEquals(true, test);
			
			boolean testfail = AppSoporte.procesarLogin("debiese", "fallar");
			assertEquals(false,testfail);
			
		}
		
		@Test 
		//BUSQUEDAS
		// Busqueda de Especialista
		void testEspecialista() {
			Especialista especialistaEsperado = new Especialista();
			Cliente clienteEsperado = new Cliente();
			Producto productoEsperado = new Producto();
			Ticket ticketEsperado = new Ticket();

			
			AppSoporte.inicializar();
			especialistaEsperado = AppSoporte.buscarEspecialista("8.309.918-6");	
			assertEquals("Luis Vega", especialistaEsperado.getNombreEspecialista());

		// Busqueda de Cliente

			clienteEsperado = AppSoporte.buscarCliente("xx.xxx.xxx-x");	
			assertEquals("xxx", clienteEsperado.getNombre());		
		

		// Busqueda de Producto

			productoEsperado = AppSoporte.buscarProducto("movil150g");	
			assertEquals("Internet Movil 150 GB", productoEsperado.getNombreProducto());		

		// Busqueda de Ticket

			ticketEsperado = AppSoporte.buscarTicket(0);	
			assertEquals("Abierto", ticketEsperado.getEstado());		
		}
		
	}
