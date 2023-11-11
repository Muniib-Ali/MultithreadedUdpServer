package wk05_multithreadedudpserver;

import java.io.*;
import java.net.*;

public class UdpClient_bare {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket();
		
		
		// send hello
		String msg = "Hello";
		byte[] buf = msg.getBytes();	// we need raw bytes
		InetAddress address = InetAddress.getByName( "127.0.0.1" );	// why getByName?
		DatagramPacket packetSend = new DatagramPacket( buf, buf.length, address, 17777 );
		
		System.out.println( "Press any key to send packet." ); System.in.read();	// simply waits for a key
		socket.send( packetSend );
	    
        socket.close();
        System.out.println( "Done." );
	}
}
