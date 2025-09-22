package chainofresponsibility.pattern;

public class Main {

	public static void main(String[] args) {
		LogProcessor logObject=new InfologProcessor(new DebuglogProcessor(new ErrorlogProcessor(null)));
		logObject.log(LogProcessor.DEBUG, "This is a debug message");
		//logObject.log(LogProcessor.INFO, "This is a INFO message");
		//logObject.log(LogProcessor.ERROR, "This is a ERROR message");

	}

}
