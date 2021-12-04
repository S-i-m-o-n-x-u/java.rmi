# java.rmi

2021年12月4日16:43:59

$ java MyRemoteImpl

java.rmi.ConnectException: Connection refused to host: 127.0.0.1; nested exception is:

        java.net.ConnectException: Connection refused: connect
        at java.rmi/sun.rmi.transport.tcp.TCPEndpoint.newSocket(TCPEndpoint.java:623)
        at java.rmi/sun.rmi.transport.tcp.TCPChannel.createConnection(TCPChannel.java:209)
        at java.rmi/sun.rmi.transport.tcp.TCPChannel.newConnection(TCPChannel.java:196)
        at java.rmi/sun.rmi.server.UnicastRef.newCall(UnicastRef.java:343)
        at java.rmi/sun.rmi.registry.RegistryImpl_Stub.rebind(RegistryImpl_Stub.java:150)
        at java.rmi/java.rmi.Naming.rebind(Naming.java:177)
        at MyRemoteImpl.main(MyRemoteImpl.java:10)
        
Caused by: java.net.ConnectException: Connection refused: connect
        at java.base/sun.nio.ch.Net.connect0(Native Method)
        at java.base/sun.nio.ch.Net.connect(Net.java:576)
        at java.base/sun.nio.ch.Net.connect(Net.java:565)
        at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:588)
        at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:333)
        at java.base/java.net.Socket.connect(Socket.java:645)
        at java.base/java.net.Socket.connect(Socket.java:595)
        at java.base/java.net.Socket.<init>(Socket.java:519)
        at java.base/java.net.Socket.<init>(Socket.java:293)
        at java.rmi/sun.rmi.transport.tcp.TCPDirectSocketFactory.createSocket(TCPDirectSocketFactory.java:40)
        at java.rmi/sun.rmi.transport.tcp.TCPEndpoint.newSocket(TCPEndpoint.java:617)
        ... 6 more
