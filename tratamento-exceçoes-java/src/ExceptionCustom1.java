import java.io.*;
import javax.swing.*;

public class ExceptionCustom1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido:");

        imprimirArquivo(nomeDoArquivo);
        System.out.println("\n Programa continua independente de Exception");

    }
    
    public static void imprimirArquivo(String nomeDoArquivo) {
        
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();    
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, 
            "Ocorreu um erro inesperado. Procure o suporte.");
            e.printStackTrace();;
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaException(file.getName(), file.getPath());
        }
    
    }

}

class ImpossivelAberturaException extends Exception {
    
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaException(String nomeDoArquivo, String diretorio) {
    super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
    this.nomeDoArquivo = nomeDoArquivo;
    this.diretorio = diretorio;
    }

    /*@Override
    public String toString() {
        return "ImpossivelAberturaException{" + 
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' + 
                '}';
    }*/

}
