import java.io.File;
import java.util.LinkedList;

public class DirectorySize {

	public static void main(String[] args) {
		File file = new File(args[0]);
		LinkedList<File> l = new LinkedList();
		l.add(file);
		int size = 0;
		while(!l.isEmpty()) {
			File file2 = l.poll();
			if (file2.isDirectory()) {
				File[] a = file2.listFiles();
				for(File file3: a)
					l.offer(file3);
			} else {
				size += file2.length();
			}
		}
		System.out.println(size);
	}

}
