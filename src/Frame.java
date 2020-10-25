import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	
	Calendar calendar;
	SimpleDateFormat timeFormat;
	JLabel timeLabel;
	JLabel dateLabel;
	String currentTime;
	String currentDate;
	SimpleDateFormat date;
	
	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(true);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		date = new SimpleDateFormat("MMM d, yyyy");
		
		
		timeLabel = new JLabel();
		dateLabel = new JLabel();
		
		currentTime = timeFormat.format(calendar.getInstance().getTime());
		timeLabel.setText(currentTime);
		
		
		
		
		
		this.add(timeLabel);
		this.add(dateLabel);
		
		
		
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		
		while(true) {
		currentTime = timeFormat.format(calendar.getInstance().getTime());
		timeLabel.setText(currentTime);
		
		currentDate = date.format(calendar.getInstance().getTime());
		dateLabel.setText(currentDate);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
	}

}
