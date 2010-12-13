package it.unitn.disi.sistar.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IFile;

public class FileUtil {

	public static File toFile(IFile file)
	{
		return new File(file.getRawLocationURI().getPath());
	}
	
	public static void copy(InputStream in, File output) throws IOException{
        OutputStream out = new FileOutputStream(output);
    
        // Transfer bytes from in to out
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }
}
