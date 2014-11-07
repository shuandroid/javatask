package thecommand;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Receiver {
	private String message;

	public Receiver(String message) {
		setMessage(message);

		// TODO Auto-generated constructor stub
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	/**
	 * 真正执行命令相应的操作
	 */
	public void action() {

		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String thetime = sm.format(new Date());
		System.out.println("系统时间为：" + thetime);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("rnennrnern") ;

			}
		}, setFormatDate(message));
	}

	public static Date setFormatDate(String dateStr) {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		Date date = null;
		try {
			date = format.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();

		}

		return date;
	}

}
