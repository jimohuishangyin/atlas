package com.alibaba.patch.utils;


public class PatchUtils {

	static {
		System.loadLibrary("PatchLibrary");
	}

	/**
	 * native方法 使用路径为oldSoPath的so与路径为patchPath的补丁包，合成新的So，并存储于newSoPath
	 * 
	 * 返回：0，说明操作成功
	 * 
	 * @param oldSoPath 示例:/sdcard/old.so
	 * @param newSoPath 示例:/sdcard/new.so
	 * @param patchPath  示例:/sdcard/xx.patch
	 * @return
	 */
	public static native int patch(String oldSoPath, String newSoPath,
			String patchPath);
}