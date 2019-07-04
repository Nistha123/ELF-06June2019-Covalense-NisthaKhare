package com.covalense.javaapp.immutable;

import lombok.extern.java.Log;

@Log
public class SingeletonMarker {
	
	private final static SingeletonMarker s = new SingeletonMarker();
	
	private SingeletonMarker()
	{
		log.info("Marker is here");
		
	}

	public static SingeletonMarker getS() {
		return s;
	}
	

}
