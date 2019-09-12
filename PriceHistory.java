import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.dao.PriceDAO;
import com.dao.PriceDAOImpl;

public class PriceHistory {
	
	public static List<Double> getEQHistory() {
		PriceDAO dao = new PriceDAOImpl();
		Calendar c = Calendar.getInstance();
		c.set(2018, Calendar.JANUARY, 1);
		List<Double> eqPrice = new ArrayList<Double>();
		for (int i = 0; i < 12; i++) {
			Date date = new Date(c.getTimeInMillis());
			double price = dao.getPriceByDate("MARUTI-EQ", date).getPrice();
			c.add(Calendar.MONTH, 1);
			eqPrice.add(price);
		}
		return eqPrice;
	}
	
	public static List<Double> getFUTHistory() {
		PriceDAO dao = new PriceDAOImpl();
		Calendar c = Calendar.getInstance();
		c.set(2018, Calendar.JANUARY, 1);

		List<Double> futPrice = new ArrayList<Double>();
		for (int i = 0; i < 12; i++) {
			Date date = new Date(c.getTimeInMillis());
			double price = dao.getPriceByDate("SBIN-FUT", date).getPrice();
			c.add(Calendar.MONTH, 1);
			futPrice.add(price);
		}

		return futPrice;
	}

	public static List<Double> getOptHistory() {
		PriceDAO dao = new PriceDAOImpl();
		Calendar c = Calendar.getInstance();
		c.set(2018, Calendar.JANUARY, 1);
		List<Double> optPrice = new ArrayList<Double>();
		for (int i = 0; i < 12; i++) {
			Date date = new Date(c.getTimeInMillis());
			double price = dao.getPriceByDate("YESBANK-OPT", date).getPrice();
			c.add(Calendar.MONTH, 1);
			optPrice.add(price);
		}
		return optPrice;
	}
	public static List<Double> getBondHistory() {
		PriceDAO dao = new PriceDAOImpl();
		Calendar c = Calendar.getInstance();
		c.set(2018, Calendar.JANUARY, 1);
		List<Double> bondPrice = new ArrayList<Double>();
		for (int i = 0; i < 12; i++) {
			Date date = new Date(c.getTimeInMillis());
			double price = dao.getPriceByDate("NHAI-BOND", date).getPrice();
			c.add(Calendar.MONTH, 1);
			bondPrice.add(price);
		}
		return bondPrice;
	}
	
	public static List<Double> getComHistory() {
		PriceDAO dao = new PriceDAOImpl();
		Calendar c = Calendar.getInstance();
		c.set(2018, Calendar.JANUARY, 1);
		

		List<Double> comPrice = new ArrayList<Double>();
		for (int i = 0; i < 12; i++) {
			Date date = new Date(c.getTimeInMillis());
			double price = dao.getPriceByDate("GOLD-COM", date).getPrice();
			c.add(Calendar.MONTH, 1);
			comPrice.add(price);
		}
		return comPrice;

	}
}
