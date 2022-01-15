package java8.SolidPrincipiles;

//class MyMessage{
//	TCPProtocolHandler tcpProtocolHandler = new TCPProtocolHandler();
//	
//	public void send(String to,String msg) {
//		tcpProtocolHandler.sendMessage("msg to : "+to+", msg : "+msg);
//	}
//}
//
//class TCPProtocolHandler{
//	public void sendMessage(String msg) {
//		System.out.println("TCPProtocolHandler sending message -" +msg);
//	}
//}
//
//class old{
//	public static void main(String[] args) {
//		 MyMessage myMessage = new MyMessage();
//		 myMessage.send("Rohit", "Hi");
//	}
//}
//==========================^ OLD ===========================================


class MyMessage2{
	ProtocolHandler protocolHandler ;
	
	public MyMessage2(String protocol) {
		protocolHandler = ProtocolHandlerFactory.getProtocolHandler(protocol);
	}
	
	public void send(String to,String msg) {
		protocolHandler.sendMessage("msg to : "+to+", msg : "+msg);
	}
}

class TCPProtocolHandler2 implements ProtocolHandler{
	public void sendMessage(String msg) {
		System.out.println("TCPProtocolHandler sending message -" +msg);

	}
}

class HttpProtocolHandler2 implements ProtocolHandler{
	public void sendMessage(String msg) {
		System.out.println("HttpProtocolHandler sending message -" +msg);

	}
}

interface ProtocolHandler {
	void sendMessage(String msg);
}

class ProtocolHandlerFactory{
	
	public static ProtocolHandler getProtocolHandler(String protocol) {
		if ("TCP".equalsIgnoreCase(protocol)) {
			return new TCPProtocolHandler2();
		}
		if ("HTTP".equalsIgnoreCase(protocol)) {
			return new HttpProtocolHandler2();
		}
		return null;
	}
}

//High level module should not directly depend on low level module, use abstraction
public class E_DependencyInversionPrinciple {
	
	public static void main(String[] args) {
		 MyMessage2 myMessage2 = new MyMessage2("TCP");
		myMessage2.send("Rohit", "Hi");
	}

}
