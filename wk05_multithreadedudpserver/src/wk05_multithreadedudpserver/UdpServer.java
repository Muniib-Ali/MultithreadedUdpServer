package wk05_multithreadedudpserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
	
	public static void main(String[] args) throws IOException {

	System.out.println("Starting....");
	
	DatagramSocket socket = new DatagramSocket( 17777 );
	byte[] buf = new byte[256];
    DatagramPacket packet = new DatagramPacket( buf, buf.length );
    
    while(true) {
    	System.out.println("Waiting for packet");
    	socket.receive( packet );
    	System.out.println("Packet received");
	    
    	
    	MultithreadUdpServer server = new MultithreadUdpServer(socket, packet);
    	server.start();
    }
    
	}
}
