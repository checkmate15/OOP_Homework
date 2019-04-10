package oop_package;

public class concreate extends teleupdate1 implements telecomInterface, ModernUpdate  { 

	@Override
	public void incoming() {
		System.out.println("Incoming [from Interface] ");
		VCtype();

		
	}

	@Override
	public void network() {
		System.out.println("Network [from Interface]");
		networkTy();

		
	}

	@Override
	public void outgoing() {
		System.out.println("Outgoing [from Interface]");
		VCtype();
	}

	@Override
	public void Camera() {
		System.out.println("camera [from interface]");
		CameraTy();
	}


	@Override
	public void privacy() {
		System.out.println("privacy  [from interface]");
		privacyty();
	}
	
	
	
}