public class Pessoa
{
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public Pessoa(String nome, int idade, double peso, double altura)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    public double getAltura()
    {
        return this.altura;
    }
    
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
}