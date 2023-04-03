/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaaaaaaaa;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author jonathani
 */
public class GeradorDeFigurinhas {
        public void cria(InputStream inputStream, String nomeArquivo) throws IOException {
        
        // leitura da imagem do computador
        //BufferedImage imagemOriginal = ImageIO.read(new File("entrada/TopMovies_1.jpg"));
        // leitura da imagem generica(computador ou url)
        //InputStream inputStream = new FileInputStream(new File("entrada/TopMovies_1.jpg"));
        //BufferedImage imagemOriginal = ImageIO.read(inputStream);
        //InputStream inputStream = new URL("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies_1.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);
        
        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
        
        
        // copiar a imagem original para novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, null, 0, 0);
        
        // configurar a fonte
        Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);
        
        // escrever uma frase na nossa imagem
        graphics.drawString("TOPZERA", 180, novaAltura - 100);
        
        
        
        // escrever a nova imagem em um arquivo
        //ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));
        // mudando para ser chamado pelo metodo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));
        
    }
}
