package org.gopro.core;

public enum Operations {

	 CAMERA_TI ( "/camera/TI"),
	 CAMERA_VR ( "/camera/VR"),
	 CAMERA_BS ( "/camera/BS"),
	 CAMERA_DS ( "/camera/DS"),
	 CAMERA_PR ( "/camera/PR"),
	 CAMERA_VM ( "/camera/VM"),
	 CAMERA_LL ( "/camera/LL"),
     CAMERA4_LL ( "/setting/8"),
	 CAMERA_PV ( "/camera/PV"),
	 CAMERA_LB ( "/camera/LB"),
	 CAMERA_VV ( "/camera/VV"),
	 CAMERA4_VV ( "/setting/2"),
	 CAMERA_FV ( "/camera/FV"),
	 CAMERA4_FV ( "/setting/4"),
	 CAMERA_FS ( "/camera/FS"),	 
	 CAMERA4_FS ( "/setting/3"),	 
	 CAMERA_EX ( "/camera/EX"),
	 CAMERA4_EX ( "/setting/9"),
	 CAMERA_PT ( "/camera/PT"),
	 CAMERA4_PT ( "/setting/10"),
	 CAMERA_WB ( "/camera/WB"),
	 CAMERA4_WB ( "/setting/11"),
	
	CAMERA_CN	("/camera/cn"),
	CAMERA_SX 	( "/camera/sx"),
	CAMERA_HS2 	( "/camera/hs"),
	BACPAC_SD 	( "/bacpac/sd"),
	CAMERA_CV 	( "/camera/cv"),
	CAMERA_DL 	( "/camera/DL"),
	CAMERA_DA 	( "/camera/DA"),
	 BACPAC_WI 	( "/bacpac/WI"),
	 BACPAC_SE 	( "/bacpac/se"),
	 BACPAC_CV 	( "/bacpac/cv"),
	 CAMERA_UP 	( "/camera/UP"),
	 CAMERA_HS 	( "/camera/HS"),
	 CAMERA_DM 	( "/camera/DM"),
	 BACPAC_SH 	( "/bacpac/SH"),
	 BACPAC_PW 	( "/bacpac/PW"),
	 CAMERA_CM 	( "/camera/CM"),
	CAMERA_AO ("/camera/AO");

	private String cmd;

	private Operations(String cmd){
		this.setCmd(cmd);
		
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	
	public String toString(){
		return getCmd();
	}
	
}
