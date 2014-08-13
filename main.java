package com.test.repository;
public class Main
{
	public static void main(String [] args)
	{
		System.out.println("Hello: " + Tool.getTool());
		System.out.println("A new tool:" + Tool.getScrewdriver());
		System.out.println("Toolbox:" + Tool.getToolBox());
	}
}