package com.covalense.javaapp.immutable;

public class SingeletonMarker {
	
	private final static SingeletonMarker s = new SingeletonMarker();
	
	private SingeletonMarker()
	{
		System.out.println("Marker is here");
		
	}

	public static SingeletonMarker getS() {
		return s;
	}
	

}
