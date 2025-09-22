package chainofresponsibility.pattern;

public class ErrorlogProcessor extends LogProcessor {

	public ErrorlogProcessor(LogProcessor nextProcessor) {
		super(nextProcessor);
		System.out.println("THIRD LOG PROCESSOR");
	}

	@Override
	public void log(int level, String message) {
		if (level == LogProcessor.ERROR) {
			System.out.println("ERROR: " + message);
		} else {
			super.log(level, message);
		}
	}

}
