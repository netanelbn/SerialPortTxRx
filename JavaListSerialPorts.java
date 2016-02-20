package git.serialporttxrx.SerialPortTxRx;

/*
* This program uses Java Simple Serial Connector library.
* The official repo for this library is at:
* https://code.google.com/p/java-simple-serial-connector/
* One way to use this library is to copy the jssc.jar file
* to your java library. For example, I created an ext
* directory in my java lib directory and put jssc.jar in
* this directory. Then add the library to the build path
* for each program that uses this library by going to - 
* Project\Properties\Java Build Path
* On the Libraries tab click Add External Jars and browes to
* where the jssc.jar folder is located.
* Since most computers these days do not have serial ports
* you can connect your serial device to your computer using
* a USB to serial adapter
*/
import jssc.SerialPortList;

public class JavaListSerialPorts
{
	public static void main(String[] args)
	{
		//getPortNames() returns an array of strings
		String[] portNames = SerialPortList.getPortNames();
		int portNamesLength = portNames.length;
		for(int i = 0; i < portNamesLength; i++)
		{
			System.out.println(portNames[i]);
		}
	}
}