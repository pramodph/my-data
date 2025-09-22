package chainofresponsibility.pattern;

public class DebuglogProcessor extends LogProcessor {

	public DebuglogProcessor(LogProcessor nextProcessor) {
		super(nextProcessor);
		System.out.println("SECOND LOG PROCESSOR");
	}

	@Override
	public void log(int level, String message) {
		if (level == LogProcessor.DEBUG) {
			System.out.println("DEBUG: " + message);
		} else {
			super.log(level, message);
		}
	}

}
