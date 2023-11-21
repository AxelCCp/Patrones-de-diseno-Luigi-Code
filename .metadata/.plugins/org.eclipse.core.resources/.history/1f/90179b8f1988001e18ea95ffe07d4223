package B2_Proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class GameImpl implements Game{
	
	private Stats stats;
	
	
	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		try {
			writeObject(name);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public Stats load(String name) {
		// TODO Auto-generated method stub
		Stats stats = null;
		
		try {
			stats = (Stats) readObject(name);
			setStats(stats);
			return stats;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private void writeObject(String name) throws IOException {
		FileOutputStream fos = new FileOutputStream(name);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(getStats());
		oos.flush();
		oos.close();
		fos.flush();
		fos.close();
	}
	
	private Object readObject(String name) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(name);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object stats = ois.readObject();
		ois.close();
		fis.close();
		return stats;
	}
	
	public void newGame(String name) {
		File file = new File(name);
		Stats stats = new Stats(name, 1, 0, 0);
		stats.setCreateAt(new Date());
		stats.setLastSave(new Date());
		setStats(stats);
		
		try {
			file.createNewFile();
			writeObject(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
