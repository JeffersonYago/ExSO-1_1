package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Principal {

	public static void main(String[] args) {
		RedesController pc = new RedesController();
		String Sistema = pc.verificaSO();
		int opc = 0;
		while (opc != 3) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - IP \n 2 - ping \n 3 - exit"));
		switch (opc) {
		case 1: if(Sistema.contains("Windows")) {
					String processo = "IPCONFIG";
					pc.IP(processo);
					break;
				}
				else if(Sistema.contains("Linux")){
					String processo = "ifconfig";
					pc.IP(processo);
				}
		case 2: if (Sistema.contains("Windows")){
					String processo = "ping -4 -n 10 www.google.com.br";
					pc.ping(processo);
				}
				else if(Sistema.contains("Linux")){
					String processo = "ping -4 -c 10 www.google.com.br";
					pc.ping(processo);
					break;
		}
	}
		}
	}
}
