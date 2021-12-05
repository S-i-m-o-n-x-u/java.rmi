### Java rmi sample code

#### How to run this code on Linux

1. Compile:
   ```sh
    $ javac *.java
   ```
2. Use rmic to generate skeletons and stub
   ```sh
   $ rmic MyRemoteImpl
   ```
3. Start the RMI register, server & client
   ```sh
   $ rmiregistry &
   ```
4. Start the server
   ```sh
   $ java MyRemoteImpl
   ```
5. Open another terminal, run client
   ```sh
   $ java MyRemoteClient
   ```

#### [Reference](https://sites.cs.ucsb.edu/~cappello/lectures/rmi/helloworld.shtml)
