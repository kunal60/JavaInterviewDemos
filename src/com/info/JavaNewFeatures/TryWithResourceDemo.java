//Part 1 
//Java 7 new feature
package com.info.JavaNewFeatures;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceDemo {

	public static void main(String[] args) {

		String projectRootpath = System.getProperty("user.dir");

		System.out.println("Java 5 features:");
		// This is the example of Try With Resources
		// try with Resources is possible because Buffered Reader Implements the
		// AutoCloseable Interface . The AutoCloseable Interface has the close
		// function. So whenever the operation completes whether there is an
		// exception or not, in the finally the br.close would be called to
		// close the fileReader

		// public interface AutoCloseable{
		// void close() throws Exception;
		// }

		try (BufferedReader br = new BufferedReader(
				new FileReader(projectRootpath + "\\src\\com\\info\\JavaNewFeatures\\Java5Features.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {

		}

		System.out.println("***************************************");

		System.out.println("Java 7 features:");
		try (BufferedReader br = new BufferedReader(
				new FileReader(projectRootpath + "\\src\\com\\info\\JavaNewFeatures\\Java7Features.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {

		}
		
		System.out.println("***************************************");
		System.out.println("Java 8 features:");
		try (BufferedReader br = new BufferedReader(
				new FileReader(projectRootpath + "\\src\\com\\info\\JavaNewFeatures\\Java8Features.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {

		}
	}

}
