package chainofresponsibility.pattern;

public abstract class LogProcessor {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	LogProcessor nextProcessor;
	
	public LogProcessor(LogProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}
	
	public void log(int level, String message) {
		if (nextProcessor != null) {
			nextProcessor.log(level, message);
		}
	}
}
