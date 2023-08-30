package controller;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class RedesController {

	public RedesController() {
		super();
	}
	public String verificaSO() {
		String Sistema = "";
		Sistema = consultaSO(Sistema);
		System.out.println(Sistema);
		return Sistema;
		}
	private String consultaSO(String Sistema) {
		Sistema = System.getProperty("os.name");
		return Sistema;
	}
	
	public void IP(String processo) {
		try {
			Process p = Runtime.getRuntime().exec(processo);
			InputStream flux = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(flux);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine(); 
			}
			buffer.close();
			leitor.close();
			flux.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void ping(String processo) {
		try {
			Process p = Runtime.getRuntime().exec(processo);
			InputStream flux = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(flux);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = buffer.readLine(); 
			}
			buffer.close();
			leitor.close();
			flux.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	}


