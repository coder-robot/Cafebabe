package me.nov.cafebabe.utils.drop;

import java.io.File;

public interface IDropUser {
	public void preLoadJars(int id);

	public void onJarLoad(int id, File input);

}
