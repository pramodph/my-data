package chainofresponsibility.pattern;

public class InfologProcessor extends LogProcessor {

	public InfologProcessor(LogProcessor nextProcessor) {
		super(nextProcessor);
		System.out.println("FIRST LOG PROCESSOR");
	}

	@Override
	public void log(int level, String message) {
		if (level == LogProcessor.INFO) {
			System.out.println("INFO: " + message);
		} else {
			super.log(level, message);
		}
	}
}
