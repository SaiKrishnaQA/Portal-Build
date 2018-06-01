/*
 * @author SaiKrishna G
 * 
 */
package com.payswiff.util;

import java.io.File;

public class DCTUtils {

	/**
	 * Creates the dir tree.
	 *
	 * @param directoryTreeName
	 *            the directory tree name
	 */
	public static void createDirTree(String directoryTreeName) {
		try {

			File dir = new File(directoryTreeName);
			if (!dir.exists()) {
				if (dir.mkdirs()) {
				} else {
				}

			}
		} catch (Exception exception) {
			/*LOG.info("Error  Exception in file::" + directoryTreeName);
			LOG.info("Error is ::" + exception.getMessage());
			exception.printStackTrace();*/
			System.out.println(exception.getMessage());
		}
	}
}
