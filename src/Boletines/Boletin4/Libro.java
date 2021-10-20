package Boletines.Boletin4;

public class Libro {

        //atributos
        private String titulo;
        private String autor;
        private int ano;
        private short numPaginas;
        private float valoracion;
        //constructores
        public Libro(){
        }
        public Libro(String a, String b, int c, short d, float e){
            titulo=a;
            autor=b;
            ano=c;
            numPaginas=d;
            valoracion=e;
        }
        //metodos de acceso
        public void setTitulo(String a){
            titulo=a;
        }
        public String getTitulo(){
            return titulo;
        }
        public void setAutor(String b){
            autor=b;
        }
        public String getAutor(){
            return autor;
        }
        public void setAno(int c){
            ano=c;
        }
        public int getAno(){
            return ano;
        }
        public void setNumPaginas(short d){
            numPaginas=d;
        }
        public short getNumPaginas(){
            return numPaginas;
        }
        public void setValoracion(float e){
            valoracion=e;
        }
        public float getValoracion(){
            return valoracion;
        }
        //método amosar
        public void amosar(){
            System.out.println("Primerlibro\nEl titulo es: "+titulo+"\nEl autor es: "+autor+"\nEl año en que se publicó es: "+ano+"\nEl número de páginas que tiene es: "+numPaginas+"\nLa valoración es: "+valoracion);
        }
}
