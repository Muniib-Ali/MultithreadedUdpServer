package wk05_multithreadedudpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MultithreadUdpServer extends Thread{
	DatagramSocket socket;
	DatagramPacket packet;
	public MultithreadUdpServer(DatagramSocket socket, DatagramPacket packet) {
		this.socket = socket;
		this.packet = packet;
		
	}
	
	public void run() {
	    System.out.println(Thread.currentThread().getName()+":" + packet.getAddress() + "/ " + packet.getPort() + "/ length of:" + packet.getLength());
	    String message = new String(packet.getData());
	    System.out.println("Message received: " + message);

	}

}
