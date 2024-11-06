package com.capgemini.java.arrays;

public class CmdArgsTest {

	public static void main(String[] args) {
		System.out.println("number of cmd args = " + args.length);

		if(args.length > 0){
			System.out.println("###--- The command-line arguments are ---###");

			int i=1;
			for(String arg : args){
				System.out.println((i++)+". " + arg);
			}
		}

	}

}
