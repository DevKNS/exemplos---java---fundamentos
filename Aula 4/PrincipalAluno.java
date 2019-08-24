/**
 * PrincipalAluno
 */
public class PrincipalAluno {

    public static void main(String[] args) {
           
        Aluno gustavo = new Aluno();
        gustavo.nome = "Gustavo dos Santos";
        gustavo.idade = 20;
        gustavo.salario = 13000;

        
        
        
        Aluno kelvin = new Aluno();
        kelvin.nome = "Kelvin Nunes";
        kelvin.idade = 19;
        kelvin.salario = 13000;
        int mediaIdade = (kelvin.idade + gustavo.idade) /2;
        System.out.println("Informações: " + "/nNome: " + kelvin.nome +
        "/nIdade: " + kelvin.idade + 
        "/nSalário: " + kelvin.salario + 
        "/n/n/n"  +
        "/nNome: " + gustavo.nome + 
        "/nIdade: " + gustavo.idade +  
        "/nSalario: " + gustavo.salario +
        "/nPeso: " + gustavo.peso + 
        "/nMedia de idade: " + mediaIdade); 

        
        
        
        
        
     

    }    
}   